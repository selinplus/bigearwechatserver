package com.bigear.wechat.dao;

import java.util.List;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.Platenum;

public interface PlatenumMapper extends Mapper<Platenum> {
  public List<Platenum> getPlatenumList(long customerId);
  public void deleteByCustomerId(long customerId);
}
