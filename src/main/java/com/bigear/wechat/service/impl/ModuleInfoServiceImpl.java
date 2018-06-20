package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.ModuleInfoMapper;
import com.bigear.wechat.model.ModuleInfo;
import com.bigear.wechat.service.ModuleInfoService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/11.
 */
@Service
@Transactional
public class ModuleInfoServiceImpl extends AbstractService<ModuleInfo> implements ModuleInfoService {
    @Resource
    private ModuleInfoMapper moduleInfoMapper;

	@Override
	public void deleteByType(String type) {
		moduleInfoMapper.deleteByType(type);
	}
  
}