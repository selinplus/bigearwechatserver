package com.bigear.wechat.configurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "wechat.upload")
@Data
public class FileUploadProperties {

  private String path;
  
}