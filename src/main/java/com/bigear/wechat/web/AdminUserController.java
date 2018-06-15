package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.AdminUser;
import com.bigear.wechat.service.AdminUserService;
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
* Created by selinplus on 2018/06/12.
*/
@RestController
@RequestMapping("/admin/user")
@SuppressWarnings({"rawtypes", "unchecked"})
public class AdminUserController {
    @Resource
    private AdminUserService adminUserService;

    @PostMapping("/login")
    public Result login(@RequestBody AdminUser adminUser) {
      AdminUser existUser = adminUserService.findBy("username", adminUser.getUsername());
      // System.out.println("exitUser: " + existUser.getPassword());
      // System.out.println("adminUser: " + adminUser.getPassword());
      if (existUser == null) {
        return ResultGenerator.genFailResult("用户不存在！");
      } else if (!existUser.getPassword().equals(adminUser.getPassword())) {
        return ResultGenerator.genFailResult("密码错误！");
      } else {
        return ResultGenerator.genSuccessResult();
      }
    }

    @PostMapping("/add")
    public Result add(AdminUser adminUser) {
        adminUserService.save(adminUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        adminUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AdminUser adminUser) {
        adminUserService.update(adminUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        AdminUser adminUser = adminUserService.findById(id);
        return ResultGenerator.genSuccessResult(adminUser);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AdminUser> list = adminUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
