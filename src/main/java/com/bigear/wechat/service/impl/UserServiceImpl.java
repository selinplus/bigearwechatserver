package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.UserMapper;
import com.bigear.wechat.model.User;
import com.bigear.wechat.service.UserService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/05/16.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
