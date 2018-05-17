package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.InformationMapper;
import com.bigear.wechat.model.Information;
import com.bigear.wechat.service.InformationService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/05/16.
 */
@Service
@Transactional
public class InformationServiceImpl extends AbstractService<Information> implements InformationService {
    @Resource
    private InformationMapper informationMapper;

    public Information getByCatagory(String catagory){
        return informationMapper.getByCatagory(catagory);
    }

	@Override
	public Information getByTitle(String title) {
		return informationMapper.getByTitle(title);
	}
}
