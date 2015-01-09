package com.jclark.controllers;

import com.jclark.services.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class HelloController {
  @Inject
  private HelloService helloService;

  @RequestMapping("/hello")
  public @ResponseBody String hello() {
    return helloService.sayHello();
  }

  @RequestMapping("/")
  public String root() {
    return "index";
  }
}
