package com.bigear.wechat.dao;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.OrderSetting;

public interface OrderSettingMapper extends Mapper<OrderSetting> {
  public OrderSetting getSettings();
}