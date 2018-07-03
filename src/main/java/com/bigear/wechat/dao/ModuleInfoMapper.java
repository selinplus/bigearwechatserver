package com.bigear.wechat.dao;

import java.util.List;

import com.bigear.wechat.core.Mapper;
import com.bigear.wechat.model.ModuleInfo;

import org.apache.ibatis.annotations.Param;

public interface ModuleInfoMapper extends Mapper<ModuleInfo> {
  public void deleteByType(String type);
  public ModuleInfo getDetail(@Param("type")String type, @Param("id")String id);
  public List<ModuleInfo> listIndustryInfo();
  public Integer totalCount();
  public List<ModuleInfo> listAll();
}