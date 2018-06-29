package com.bigear.wechat.model;

import lombok.Data;

@Data
public class OrderDetail {
  private String name;
  private String phone;
  private String platenum;
  private String vehicleType;
  private Float vehicleTypeFee;
  private String secuAddition;
  private Float secuAdditionFee;
  private String fuelType;
  private Float fuelTypeFee;
  private String envCheck;
  private Float envCheckFee;
  private Float totalFee;
}