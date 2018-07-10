package com.bigear.wechat.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
  @RequestMapping("/")  
  public String clientPage(){  
      return "index";
  }  

  @RequestMapping("/admin")  
  public ModelAndView serverPage(){  
      return new ModelAndView("server");  
  }  
}