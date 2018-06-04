package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.PlatenumMapper;
import com.bigear.wechat.model.Platenum;
import com.bigear.wechat.service.PlatenumService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/05/28.
 */
@Service
@Transactional
public class PlatenumServiceImpl extends AbstractService<Platenum> implements PlatenumService {
    @Resource
    private PlatenumMapper platenumMapper;

}
