package com.bigear.wechat.dto;

import java.util.List;

import com.bigear.wechat.model.Customer;

import lombok.Data;

@Data
public class Register {
  private Customer customer;
  private List<Car> cars; 
}