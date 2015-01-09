package com.jclark.features;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HelloTest extends FeatureTest {

  @Test
  public void helloSpec() {
    goTo("/hello");
    assertThat(pageSource(), containsString("hello"));
  }
}
