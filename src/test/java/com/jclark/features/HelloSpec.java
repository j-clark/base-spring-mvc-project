package com.jclark.features;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HelloSpec extends FluentTest {

  @Test
  public void helloSpec() {

//    System.

    goTo("http://localhost:8080/hello");
    assertThat(pageSource(), containsString("hello"));
  }
}
