package com.bigear.wechat.web;

import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author selinplus
 */
@RestController
@RequestMapping("/wechat/portal")
public class WechatController {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private WxMpService wxService;

  @Autowired
  private WxMpMessageRouter router;

  @GetMapping(produces = "text/plain;charset=utf-8")
  public void authGet(
      @RequestParam(name = "signature",
          required = false) String signature,
      @RequestParam(name = "timestamp",
          required = false) String timestamp,
      @RequestParam(name = "nonce", required = false) String nonce,
      @RequestParam(name = "echostr", required = false) String echostr,
      HttpServletRequest request, HttpServletResponse response) {

    this.logger.info("\n接收到来自微信服务器的认证消息：[{}, {}, {}, {}]", signature,
        timestamp, nonce, echostr);

    if (StringUtils.isAnyBlank(signature, timestamp, nonce, echostr)) {
      throw new IllegalArgumentException("请求参数非法，请核实!");
    }
    PrintWriter out;
	try {
		out = response.getWriter();
		this.logger.info("\n认证结果：【{}】",this.wxService.checkSignature(timestamp, nonce, signature));
	    if (this.wxService.checkSignature(timestamp, nonce, signature)) {
	      out.print(echostr);
	    }
	    out.print("非法请求");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
  }

 // @PostMapping(produces = "application/xml; charset=UTF-8")
  @PostMapping(produces = "application/xml")
  public String post(@RequestBody String requestBody,
                     @RequestParam("signature") String signature,
                     @RequestParam("timestamp") String timestamp,
                     @RequestParam("nonce") String nonce,
                     @RequestParam(name = "encrypt_type",
                         required = false) String encType,
                     @RequestParam(name = "msg_signature",
                         required = false) String msgSignature) {
    this.logger.info(
        "\n接收微信请求：[signature=[{}], encType=[{}], msgSignature=[{}],"
            + " timestamp=[{}], nonce=[{}], requestBody=[\n{}\n] ",
        signature, encType, msgSignature, timestamp, nonce, requestBody);

    if (!this.wxService.checkSignature(timestamp, nonce, signature)) {
      throw new IllegalArgumentException("非法请求，可能属于伪造的请求！");
    }

    String out = null;
    if (encType == null) {
      // 明文传输的消息
      WxMpXmlMessage inMessage = WxMpXmlMessage.fromXml(requestBody);
      WxMpXmlOutMessage outMessage = this.route(inMessage);
      if (outMessage == null) {
        return "";
      }

      out = outMessage.toXml();
    } else if ("aes".equals(encType)) {
      // aes加密的消息
      WxMpXmlMessage inMessage = WxMpXmlMessage.fromEncryptedXml(
          requestBody, this.wxService.getWxMpConfigStorage(), timestamp,
          nonce, msgSignature);
      this.logger.debug("\n消息解密后内容为：\n{} ", inMessage.toString());
      WxMpXmlOutMessage outMessage = this.route(inMessage);
      if (outMessage == null) {
        return "";
      }

      out = outMessage
          .toEncryptedXml(this.wxService.getWxMpConfigStorage());
    }

    this.logger.debug("\n组装回复信息：{}", out);

    return out;
  }

  private WxMpXmlOutMessage route(WxMpXmlMessage message) {
    try {
      return this.router.route(message);
    } catch (Exception e) {
      this.logger.error(e.getMessage(), e);
    }

    return null;
  }

}
