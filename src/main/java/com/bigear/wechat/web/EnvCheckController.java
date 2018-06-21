package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.EnvCheck;
import com.bigear.wechat.service.EnvCheckService;
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
@RequestMapping("/env/check")
@SuppressWarnings({"rawtypes", "unchecked"})
public class EnvCheckController {
    @Resource
    private EnvCheckService envCheckService;

    @PostMapping("/add")
    public Result add(@RequestBody EnvCheck envCheck) {
        envCheckService.save(envCheck);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam String ids) {
        envCheckService.deleteByIds(ids);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody EnvCheck envCheck) {
        envCheckService.update(envCheck);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        EnvCheck envCheck = envCheckService.findById(id);
        return ResultGenerator.genSuccessResult(envCheck);
    }

    @GetMapping("/list")
    public Result list() {
        List<EnvCheck> list = envCheckService.findAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
