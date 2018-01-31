package com.greenfoxacademy.demo;


import com.greenfoxacademy.demo.models.Cloth;
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

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestexamtwoApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class TestexamtwoApplicationTests {
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void contextLoads() throws Exception {
		List<Cloth> clothesList = new ArrayList<>();
		Cloth cloth1 = new Cloth(16,"Strecth Steamed Pencil Skirt", "Calvin Klein", "skirts", "s", 39, 0);
		Cloth cloth2 = new Cloth(18, "Strecth Steamed Pencil Skirt", "Calvin Klein", "skirts", "m", 39, 0);
		clothesList.add(cloth1);
		clothesList.add(cloth2);
		mockMvc.perform(
						get("/warehouse/query?price=40&type=lower")
		)
						.andExpect(status().isOk())
						.andExpect(content().contentType("application/json;charset=UTF-8"))
						.andExpect(jsonPath("$.result", is("ok")))
		        .andExpect(jsonPath("$.clothes", is(clothesList.get(0))));
	}

}
