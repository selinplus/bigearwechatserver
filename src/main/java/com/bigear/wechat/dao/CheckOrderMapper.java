package com.bigear.wechat.dao;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.CheckOrder;

import org.apache.ibatis.annotations.Param;

public interface CheckOrderMapper extends Mapper<CheckOrder> {
  public CheckOrder getDetailById(long id);
  public void updatePayStatus(@Param("orderNum") String orderNum, @Param("payStatus") String payStatus);
  public void deleteByOrderNum(String orderNum);
  public CheckOrder getUnpaidOrder(long customerId);
}