package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.SecurityCheckMapper;
import com.bigear.wechat.model.SecurityCheck;
import com.bigear.wechat.service.SecurityCheckService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/21.
 */
@Service
@Transactional
public class SecurityCheckServiceImpl extends AbstractService<SecurityCheck> implements SecurityCheckService {
    @Resource
    private SecurityCheckMapper securityCheckMapper;

}
