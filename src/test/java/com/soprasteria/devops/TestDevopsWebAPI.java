package com.soprasteria.devops;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.soprasteria.devops.controller.CommonController;
import com.soprasteria.devops.model.BaseObj;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CommonController.class)
public class TestDevopsWebAPI {

	@Autowired
	private MockMvc mockMvc;

	BaseObj model = new BaseObj("2035", "DEVOPS Accelerator", "Sopra Steria India");

	@Before
	public void beforeMethod() {
		System.out.println("Junit testing started.....");
	}

	@Test
	public void checkDetails() throws Exception {

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/hello-world").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println("response:::::: " + result.getResponse());

		String expected = "{\"id\": \"2035\",\"projectName\": \"DEVOPS Accelerator\",\"companyName\": \"Sopra Steria India\"}";

		JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);

	}

	@After
	public void afterMethod() {
		System.out.println("Junit testing Ended.....");
	}

}
