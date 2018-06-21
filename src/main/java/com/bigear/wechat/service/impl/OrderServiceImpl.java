package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.OrderMapper;
import com.bigear.wechat.model.Order;
import com.bigear.wechat.service.OrderService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/21.
 */
@Service
@Transactional
public class OrderServiceImpl extends AbstractService<Order> implements OrderService {
    @Resource
    private OrderMapper orderMapper;

}
