package com.jclark.features;

import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.Fluent;

public abstract class FeatureTest extends FluentTest {

  @Override
  public Fluent goTo(String path) {
    String baseUrl = System.getProperty("baseUrl", "http://localhost:9081");
    return super.goTo(baseUrl + path);
  }
}
