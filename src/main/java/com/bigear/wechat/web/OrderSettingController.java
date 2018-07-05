package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.OrderSetting;
import com.bigear.wechat.service.OrderSettingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by selinplus on 2018/07/04.
*/
@RestController
@RequestMapping("/order/setting")
@SuppressWarnings({"rawtypes", "unchecked"})
public class OrderSettingController {
    @Resource
    private OrderSettingService orderSettingService;

    @PostMapping("/add")
    public Result add(@RequestBody OrderSetting orderSetting) {
        orderSettingService.save(orderSetting);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        orderSettingService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody OrderSetting orderSetting) {
        orderSettingService.update(orderSetting);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        OrderSetting orderSetting = orderSettingService.findById(id);
        return ResultGenerator.genSuccessResult(orderSetting);
    }

    @PostMapping("/getSettings")
    public Result getSettings() {
        OrderSetting orderSetting = orderSettingService.getSettings();
        return ResultGenerator.genSuccessResult(orderSetting);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<OrderSetting> list = orderSettingService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
