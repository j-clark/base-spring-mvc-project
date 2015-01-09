package com.jclark.controllers;

import com.jclark.services.HelloService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

public class HelloControllerTest {

  @Inject
  private HelloController helloController;

  @Mock
  private HelloService helloService;

  private String hello = "hello";

  @Before
  public void before() {
    MockitoAnnotations.initMocks(this);
    when(helloService.sayHello()).thenReturn(hello);
  }

  @Test
  public void itDelegatesToTheHelloService() {
    assertThat(helloService.sayHello(), is(hello));
  }
}