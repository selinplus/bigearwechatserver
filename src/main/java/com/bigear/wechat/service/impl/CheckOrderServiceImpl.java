package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.CheckOrderMapper;
import com.bigear.wechat.model.CheckOrder;
import com.bigear.wechat.service.CheckOrderService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/25.
 */
@Service
@Transactional
public class CheckOrderServiceImpl extends AbstractService<CheckOrder> implements CheckOrderService {
    @Resource
    private CheckOrderMapper checkOrderMapper;

	@Override
	public CheckOrder getDetaiById(long id) {
		return checkOrderMapper.getDetailById(id);
	}

	@Override
	public void updatePayStatus(String orderNum, String payStatus) {
		checkOrderMapper.updatePayStatus(orderNum, payStatus);
	}

	@Override
	public void deleteByOrderNum(String orderNum) {
		checkOrderMapper.deleteByOrderNum(orderNum);
	}

	@Override
	public CheckOrder getUnpaidOrder(long customerId) {
		return checkOrderMapper.getUnpaidOrder(customerId);
	}

}
