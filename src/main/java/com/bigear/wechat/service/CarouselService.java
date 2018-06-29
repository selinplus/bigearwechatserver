package com.bigear.wechat.service;
import com.bigear.wechat.model.Carousel;

import java.util.List;

import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/06/29.
 */
public interface CarouselService extends Service<Carousel> {
  public List<Carousel> findByModuleInfoId(String moduleInfoId);
}
