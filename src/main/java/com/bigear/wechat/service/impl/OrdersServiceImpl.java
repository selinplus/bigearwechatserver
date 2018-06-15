package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.OrdersMapper;
import com.bigear.wechat.model.Orders;
import com.bigear.wechat.service.OrdersService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/05.
 */
@Service
@Transactional
public class OrdersServiceImpl extends AbstractService<Orders> implements OrdersService {
    @Resource
    private OrdersMapper ordersMapper;

}
