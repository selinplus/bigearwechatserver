package com.bigear.wechat.service;
import com.bigear.wechat.model.Platenum;

import java.util.List;

import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/06/07.
 */
public interface PlatenumService extends Service<Platenum> {
  public List<Platenum> getPlatenumList(long customerId);
  public void deleteByCustomerId(long customerId);
}
