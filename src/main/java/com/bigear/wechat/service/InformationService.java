package com.bigear.wechat.service;
import com.bigear.wechat.model.Information;
import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/05/16.
 */
public interface InformationService extends Service<Information> {
    Information getByCatagory(String catagory);

	Information getByTitle(String title);
}
