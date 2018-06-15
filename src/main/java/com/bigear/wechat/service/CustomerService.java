package com.bigear.wechat.service;
import com.bigear.wechat.model.Customer;
import com.bigear.wechat.core.Service;


/**
 * Created by selinplus on 2018/06/05.
 */
public interface CustomerService extends Service<Customer> {
  public void deleteByCustomerId(long customerId);
}
