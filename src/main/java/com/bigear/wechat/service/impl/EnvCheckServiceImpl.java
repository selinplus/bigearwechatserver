package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.EnvCheckMapper;
import com.bigear.wechat.model.EnvCheck;
import com.bigear.wechat.service.EnvCheckService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/21.
 */
@Service
@Transactional
public class EnvCheckServiceImpl extends AbstractService<EnvCheck> implements EnvCheckService {
    @Resource
    private EnvCheckMapper envCheckMapper;

}
