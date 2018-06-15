package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.AdminUserMapper;
import com.bigear.wechat.model.AdminUser;
import com.bigear.wechat.service.AdminUserService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/12.
 */
@Service
@Transactional
public class AdminUserServiceImpl extends AbstractService<AdminUser> implements AdminUserService {
    @Resource
    private AdminUserMapper adminUserMapper;

}
