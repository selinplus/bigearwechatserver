package com.bigear.wechat.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.WxJsapiSignature;
// import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.error.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

@RestController
public class WechatOauth2Controller {
	  private final Logger logger = LoggerFactory.getLogger(this.getClass());

	  @Autowired
	  private WxMpService wxService;
	  
	  @GetMapping("/wechat/oauth/auth_url")
	  public String authUrl(@RequestParam("uri") String redirectURI) {
		  logger.debug("收到前端传来的构造uri,redirectURI:" + redirectURI);
		  return wxService.oauth2buildAuthorizationUrl(redirectURI, WxConsts.OAuth2Scope.SNSAPI_USERINFO, null);
	  }
	  @GetMapping("/wechat/getconfig")
	  public WxJsapiSignature getConfig(@RequestParam("uri") String uri) {
		logger.debug("收到前端传来的构造uri,redirectURI:" + uri);
		try {
			return wxService.createJsapiSignature(uri);
		} catch (WxErrorException e) {
			e.printStackTrace();
			return null;
		}
	  }
	  
	  @GetMapping("/wechat/oauth/code2accesstoken")
	  public WxMpUser code2access(@RequestParam("code") String code) {
		WxMpOAuth2AccessToken wxMpOAuth2AccessToken = null;
		WxMpUser wxMpUser =null;
		try {
			logger.debug("收到前端传回的code,code:" + code);
			wxMpOAuth2AccessToken = wxService.oauth2getAccessToken(code);
			logger.debug("通过code换取access_token,access_token:" + wxMpOAuth2AccessToken.getAccessToken());
			wxMpUser = wxService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);
			logger.debug("通过access_token获取当前用户信息,wxMpUser:" + wxMpUser.toString());
		} catch (WxErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wxMpUser;
	  }
}
