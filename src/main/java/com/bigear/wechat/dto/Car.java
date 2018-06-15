package com.bigear.wechat.dto;

import java.util.List;

import com.bigear.wechat.model.Photo;

import lombok.Data;

@Data
public class Car {
  private String plateNum;
  private List<String> photos;
}