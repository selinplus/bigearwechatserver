package com.bigear.wechat.dto;

import java.util.List;

import com.bigear.wechat.model.Carousel;
import com.bigear.wechat.model.ModuleInfo;

import lombok.Data;

@Data
public class DataInput {
  private ModuleInfo moduleInfo;
  private List<Carousel> carousels;
}