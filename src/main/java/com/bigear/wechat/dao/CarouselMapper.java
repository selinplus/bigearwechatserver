package com.bigear.wechat.dao;

import java.util.List;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.Carousel;

public interface CarouselMapper extends Mapper<Carousel> {
  public List<Carousel> findByModuleInfoId(String id);
}