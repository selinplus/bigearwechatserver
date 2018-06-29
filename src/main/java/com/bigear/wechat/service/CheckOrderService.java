package com.bigear.wechat.service;
import com.bigear.wechat.model.CheckOrder;

import org.apache.ibatis.annotations.Param;

import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/06/25.
 */
public interface CheckOrderService extends Service<CheckOrder> {
  public CheckOrder getDetaiById(long id);
  public void updatePayStatus(String orderNum, String payStatus);
  public void deleteByOrderNum(String orderNum);
  public CheckOrder getUnpaidOrder(long customerId);
}
