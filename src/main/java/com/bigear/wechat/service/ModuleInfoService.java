package com.bigear.wechat.service;
import com.bigear.wechat.model.ModuleInfo;
import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/06/11.
 */
public interface ModuleInfoService extends Service<ModuleInfo> {
  public void deleteByType(String type);
}
