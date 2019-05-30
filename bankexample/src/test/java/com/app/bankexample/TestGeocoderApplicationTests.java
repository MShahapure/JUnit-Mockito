package com.app.bankexample;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.app.bankexample.controller.GeoController;
import com.app.bankexample.model.Location;
import com.app.bankexample.service.GeoService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestGeocoderApplicationTests {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	//@MockBean annotation is used to create the mock object to be injected and using Mockito methods directly in the test class
	@MockBean
	GeoService service;
	
	//@MockBean annotation is used to create the mock object to be injected and using Mockito methods directly in the test class
	
	
	@Autowired
	GeoController controller;

	@Test
	public void getLocationTest() throws Exception {
		Location location=new Location();
		when(service.getLocation(anyString())).thenReturn(location);
		mockMvc.perform(MockMvcRequestBuilders.get("/getLocation/TestLocation")
				.contentType(MediaType.APPLICATION_JSON)
				
				.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andDo(print());
	}
	
}
