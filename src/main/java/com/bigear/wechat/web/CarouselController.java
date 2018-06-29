package com.bigear.wechat.web;
import com.bigear.wechat.core.Result;
import com.bigear.wechat.core.ResultGenerator;
import com.bigear.wechat.model.Carousel;
import com.bigear.wechat.service.CarouselService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by selinplus on 2018/06/29.
*/
@RestController
@RequestMapping("/carousel")
@SuppressWarnings({"rawtypes", "unchecked"})
public class CarouselController {
    @Resource
    private CarouselService carouselService;

    @PostMapping("/add")
    public Result add(Carousel carousel) {
        carouselService.save(carousel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        carouselService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Carousel carousel) {
        carouselService.update(carousel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Carousel carousel = carouselService.findById(id);
        return ResultGenerator.genSuccessResult(carousel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Carousel> list = carouselService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
