package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.CarouselMapper;
import com.bigear.wechat.model.Carousel;
import com.bigear.wechat.service.CarouselService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/29.
 */
@Service
@Transactional
public class CarouselServiceImpl extends AbstractService<Carousel> implements CarouselService {
    @Resource
    private CarouselMapper carouselMapper;

    @Override
    public List<Carousel> findByModuleInfoId(String moduleInfoId) {
      return carouselMapper.findByModuleInfoId(moduleInfoId);
    }

}
