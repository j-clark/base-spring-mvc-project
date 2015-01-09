package com.jclark.services;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HelloServiceTest {
  public HelloService helloService;

  @Before
  public void before() {
    helloService = new HelloService();
  }

  @Test
  public void itSaysHello() {
    assertThat(helloService.sayHello(), is("hello"));
  }
}