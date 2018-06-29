package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.SecurityCheck;
import com.bigear.wechat.service.SecurityCheckService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by selinplus on 2018/06/21.
*/
@RestController
@RequestMapping("/security/check")
@SuppressWarnings({"rawtypes", "unchecked"})
public class SecurityCheckController {
    @Resource
    private SecurityCheckService securityCheckService;

    @PostMapping("/add")
    public Result add(@RequestBody SecurityCheck securityCheck) {
        securityCheckService.save(securityCheck);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String ids) {
        securityCheckService.deleteByIds(ids);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody SecurityCheck securityCheck) {
        securityCheckService.update(securityCheck);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        SecurityCheck securityCheck = securityCheckService.findById(id);
        return ResultGenerator.genSuccessResult(securityCheck);
    }

    @GetMapping("/list")
    public Result list() {
        List<SecurityCheck> list = securityCheckService.findAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
