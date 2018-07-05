package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.OrderSettingMapper;
import com.bigear.wechat.model.OrderSetting;
import com.bigear.wechat.service.OrderSettingService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/07/04.
 */
@Service
@Transactional
public class OrderSettingServiceImpl extends AbstractService<OrderSetting> implements OrderSettingService {
    @Resource
    private OrderSettingMapper orderSettingMapper;

	@Override
	public OrderSetting getSettings() {
		return orderSettingMapper.getSettings();
	}

}
