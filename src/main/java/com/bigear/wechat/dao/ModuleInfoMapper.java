package com.bigear.wechat.dao;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.ModuleInfo;

public interface ModuleInfoMapper extends Mapper<ModuleInfo> {
  public void deleteByType(String type);
}