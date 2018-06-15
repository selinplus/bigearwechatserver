package com.bigear.wechat.dao;

import java.util.List;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.Photo;

public interface PhotoMapper extends Mapper<Photo> {
  public List<String> getPhotoList(long platenumId);
  public void deleteByPlatenumId(long platenumId);
}