package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.dto.DataInput;
import com.bigear.wechat.model.Carousel;
import com.bigear.wechat.model.ModuleInfo;
import com.bigear.wechat.service.CarouselService;
import com.bigear.wechat.service.ModuleInfoService;
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
* Created by selinplus on 2018/06/29.
*/
@RestController
@RequestMapping("/module/info")
@SuppressWarnings({"rawtypes", "unchecked"})
public class ModuleInfoController {
    @Resource
    private ModuleInfoService moduleInfoService;
    @Resource
    private CarouselService carouselService;
    @PostMapping("/add")
    public Result add(@RequestBody DataInput dataInput) {
        ModuleInfo moduleInfo = dataInput.getModuleInfo();
        if (!moduleInfo.getType().equals("行业资讯")) {
          moduleInfoService.deleteByType(moduleInfo.getType());
        }
        moduleInfoService.save(moduleInfo);
        List<Carousel> carousels = dataInput.getCarousels();
        for (int i=0; i<carousels.size(); i++) {
          carouselService.save(carousels.get(i));
        }
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        moduleInfoService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ModuleInfo moduleInfo) {
        moduleInfoService.update(moduleInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam String type, @RequestParam(defaultValue = "") String id) {
        System.out.println("type: " + type);
        System.out.println("id: " + id);
        ModuleInfo moduleInfo = moduleInfoService.getDetail(type, id);
        DataInput dataInput = new DataInput();
        dataInput.setModuleInfo(moduleInfo);
        if ("".equals(id)) {
          List<Carousel> carousels = carouselService.findByModuleInfoId(moduleInfo.getId());
          dataInput.setCarousels(carousels);
        }
        return ResultGenerator.genSuccessResult(dataInput);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ModuleInfo> list = moduleInfoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
