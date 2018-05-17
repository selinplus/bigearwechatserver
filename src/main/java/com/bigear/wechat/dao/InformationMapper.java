package com.bigear.wechat.dao;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.Information;

public interface InformationMapper extends Mapper<Information> {
    Information getByCatagory(String catagory);

    Information getByTitle(String title);
}