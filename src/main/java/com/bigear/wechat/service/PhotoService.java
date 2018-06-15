package com.bigear.wechat.service;
import com.bigear.wechat.model.Photo;

import java.util.List;

import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/06/05.
 */
public interface PhotoService extends Service<Photo> {
  public List<String> getPhotoList(long platenumId);
  public void deleteByPlatenumId(long platenumId);
}
