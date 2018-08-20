package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.CustomerVoiceMapper;
import com.bigear.wechat.model.CustomerVoice;
import com.bigear.wechat.service.CustomerVoiceService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/08/20.
 */
@Service
@Transactional
public class CustomerVoiceServiceImpl extends AbstractService<CustomerVoice> implements CustomerVoiceService {
    @Resource
    private CustomerVoiceMapper customerVoiceMapper;

}
