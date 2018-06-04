package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.CustomerMapper;
import com.bigear.wechat.model.Customer;
import com.bigear.wechat.service.CustomerService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/05/28.
 */
@Service
@Transactional
public class CustomerServiceImpl extends AbstractService<Customer> implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;

}
