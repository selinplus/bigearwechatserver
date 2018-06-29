package com.bigear.wechat.dao;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.ModuleInfo;

import org.apache.ibatis.annotations.Param;

public interface ModuleInfoMapper extends Mapper<ModuleInfo> {
  public void deleteByType(String type);
  public ModuleInfo getDetail(@Param("type")String type, @Param("id")String id);
}