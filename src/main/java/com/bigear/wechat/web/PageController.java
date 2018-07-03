package com.bigear.wechat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
  @RequestMapping("/")  
  public String clientPage(){  
      return "index";  
  }  

  @RequestMapping("/admin")  
  public String serverPage(){  
      return "server";  
  }  
}