package com.greenfoxacademy.demo.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.demo.WeekNineDayOneApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WeekNineDayOneApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class DoublingControllerTest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testDoubling() throws Exception {
    mockMvc.perform(
            get("/doubling?input=10.0")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            //.andExpect(jsonPath("$.received", is(10)))
            .andExpect(jsonPath("$.result", is(20.0)));
  }
  @Test
  public void testDoublingForEmptyInput() throws Exception {
    mockMvc.perform(
            get("/doubling?input=")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            //.andExpect(jsonPath("$.received", is(10)))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }
  @Test
  public void testDoublingForFloat() throws Exception {
    mockMvc.perform(
            get("/doubling?input=5.3")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            //.andExpect(jsonPath("$.received", is(10)))
            .andExpect(jsonPath("$.result", is(10.6)));
  }
}