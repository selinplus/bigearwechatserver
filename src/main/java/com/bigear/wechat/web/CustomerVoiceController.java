package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.CustomerVoice;
import com.bigear.wechat.service.CustomerVoiceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by selinplus on 2018/09/04.
*/
@RestController
@RequestMapping("/customer/voice")
@SuppressWarnings({"rawtypes", "unchecked"})
public class CustomerVoiceController {
    @Resource
    private CustomerVoiceService customerVoiceService;

    @PostMapping("/add")
    public Result add(@RequestBody CustomerVoice customerVoice) {
        customerVoiceService.save(customerVoice);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        customerVoiceService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/deleteByIds")
    public Result deleteByIds(@RequestParam String ids) {
      customerVoiceService.deleteByIds(ids);
      return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody CustomerVoice customerVoice) {
        customerVoiceService.update(customerVoice);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        CustomerVoice customerVoice = customerVoiceService.findById(id);
        return ResultGenerator.genSuccessResult(customerVoice);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<CustomerVoice> list = customerVoiceService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @GetMapping("/listAll")
    public Result list() {
        List<CustomerVoice> list = customerVoiceService.findAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
