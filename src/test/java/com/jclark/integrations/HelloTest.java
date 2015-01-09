package com.jclark.integrations;

import com.jclark.support.IntegrationTest;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloTest extends IntegrationTest {

  @Test
  public void testHello() throws Exception {
    MockHttpServletResponse result = mockMvc.perform(get("/hello")).andExpect(status().isOk()).andReturn().getResponse();
    assertThat(result.getContentAsString(), containsString("hello"));
  }
}
