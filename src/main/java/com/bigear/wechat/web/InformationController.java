package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.Information;
import com.bigear.wechat.service.InformationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import javax.annotation.Resource;
import java.util.List;

/**
* Created by selinplus on 2018/05/16.
*/
@RestController
@RequestMapping("/information")
@SuppressWarnings({"rawtypes", "unchecked"})
public class InformationController {
    @Resource
    private InformationService informationService;

    @PostMapping("/add")
    public Result add(Information information) {
        informationService.save(information);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        informationService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Information information) {
        informationService.update(information);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Information information = informationService.findById(id);
        return ResultGenerator.genSuccessResult(information);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Information> list = informationService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
    @GetMapping("/catagory/{catagory}")
    public Result catagory(@PathVariable String catagory){
        Information information = informationService.getByCatagory(catagory);
        return ResultGenerator.genSuccessResult(information);
    }
    @GetMapping("/title/{title}")
    public Result title(@PathVariable String title){
        Information information = informationService.getByTitle(title);
        return ResultGenerator.genSuccessResult(information);
    }
}
