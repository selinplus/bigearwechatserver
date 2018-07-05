package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.CheckOrder;
import com.bigear.wechat.service.CheckOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
* Created by selinplus on 2018/06/25.
*/
@RestController
@RequestMapping("/check/order")
@SuppressWarnings({"rawtypes", "unchecked"})
public class CheckOrderController {
    @Resource
    private CheckOrderService checkOrderService;

    @PostMapping("/add")
    public Result add(@RequestBody CheckOrder checkOrder) {
        checkOrderService.save(checkOrder);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String orderNum) {
        checkOrderService.deleteByOrderNum(orderNum);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/deleteByIds")
    public Result deleteByIds(@RequestParam String ids) {
        checkOrderService.deleteByIds(ids);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody CheckOrder checkOrder) {
        checkOrderService.update(checkOrder);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String orderNum) {
        CheckOrder checkOrder = checkOrderService.findBy("orderNum", orderNum);
        return ResultGenerator.genSuccessResult(checkOrder);
    }

    @GetMapping("/unpaid")
    public Result getUnpaidOrder(@RequestParam long customerId) {
        CheckOrder checkOrder = checkOrderService.getUnpaidOrder(customerId);
        return ResultGenerator.genSuccessResult(checkOrder);
    }

    @GetMapping("/list")
    public Result list() {
        // PageHelper.startPage(page, size);
        List<CheckOrder> list = checkOrderService.findAll();
        // PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/checkOrderDate")
    public Result checkOrderDate(@RequestParam long orderDate, @RequestParam int hourAmount) throws ParseException {
      System.out.println("**************orderDate************" + orderDate);
      System.out.println("**************hourAmount************" + hourAmount);
      Date date = new Date(orderDate);
      SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH");
      String tmpDateStr = s.format(date);
      SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd HH");
      long curTimeStamp = s2.parse(tmpDateStr).getTime();
      System.out.println("***********curTimeStamp*************" + curTimeStamp);
      int orderCount = checkOrderService.orderCountByOrderDate(curTimeStamp / 1000);
      System.out.println("********orderCount*********" + orderCount);
      if (orderCount > hourAmount) {
        return ResultGenerator.genSuccessResult("预约时间段已达预约上限，请更改预约时间！");
      } else {
        return ResultGenerator.genSuccessResult();
      }
    }
}
