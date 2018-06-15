package com.bigear.wechat.service.impl;

import com.bigear.wechat.dao.PlatenumMapper;
import com.bigear.wechat.model.Platenum;
import com.bigear.wechat.service.PlatenumService;
import com.bigear.wechat.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by selinplus on 2018/06/07.
 */
@Service
@Transactional
public class PlatenumServiceImpl extends AbstractService<Platenum> implements PlatenumService {
    @Resource
    private PlatenumMapper platenumMapper;

    @Override
    public List<Platenum> getPlatenumList(long customerId) {
      return platenumMapper.getPlatenumList(customerId);
    }

	@Override
	public void deleteByCustomerId(long customerId) {
		platenumMapper.deleteByCustomerId(customerId);
	}

}
