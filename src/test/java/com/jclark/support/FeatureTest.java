package com.jclark.support;

import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.Fluent;

public abstract class FeatureTest extends FluentTest {

  @Override
  public Fluent goTo(String path) {
    String baseUrl = System.getProperty("baseUrl", "http://localhost:9080");
    return super.goTo(baseUrl + path);
  }
}
