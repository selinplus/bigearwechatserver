package com.bigear.wechat.service;
import com.bigear.wechat.model.OrderSetting;
import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/07/04.
 */
public interface OrderSettingService extends Service<OrderSetting> {
  public OrderSetting getSettings();
}
