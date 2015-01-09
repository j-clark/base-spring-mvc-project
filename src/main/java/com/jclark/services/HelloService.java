package com.jclark.services;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
  public String sayHello() {
    return "hello";
  }
}
