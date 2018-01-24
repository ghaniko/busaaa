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
public class DoUntilControllerTest {
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testDoUntilForSum() throws Exception {
    mockMvc.perform(
            post("/dountil/sum")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 10}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(55)));
  }

  @Test
  public void testDoUntilForFactor() throws Exception {
    mockMvc.perform(
            post("/dountil/factor")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}")
    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(120)));
  }

  @Test
  public void testDoUntilError() throws Exception {
    mockMvc.perform(
            post("/dountil/factor")
                    .contentType(MediaType.APPLICATION_JSON)

    )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.error", is("Please provide a number!")));
  }
}