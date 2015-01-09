package com.jclark.features;

import com.jclark.support.FeatureTest;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class HelloTest extends FeatureTest {

  @Test
  public void hello() {
    goTo("/hello");
    assertThat(pageSource(), containsString("hello"));
  }
}
