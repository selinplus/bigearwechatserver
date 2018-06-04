package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.PhotoMapper;
import com.bigear.wechat.model.Photo;
import com.bigear.wechat.service.PhotoService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/05/28.
 */
@Service
@Transactional
public class PhotoServiceImpl extends AbstractService<Photo> implements PhotoService {
    @Resource
    private PhotoMapper photoMapper;

}
