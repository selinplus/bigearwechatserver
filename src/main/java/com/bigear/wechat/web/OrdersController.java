package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.Orders;
import com.bigear.wechat.service.OrdersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by selinplus on 2018/06/05.
*/
@RestController
@RequestMapping("/orders")
@SuppressWarnings({"rawtypes", "unchecked"})
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @PostMapping("/add")
    public Result add(Orders orders) {
        ordersService.save(orders);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        ordersService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Orders orders) {
        ordersService.update(orders);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Orders orders = ordersService.findById(id);
        return ResultGenerator.genSuccessResult(orders);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Orders> list = ordersService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
