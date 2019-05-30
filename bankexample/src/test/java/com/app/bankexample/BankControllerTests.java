package com.app.bankexample;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
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
import com.app.bankexample.controller.BankUserController;
import com.app.bankexample.model.BankUser;
import com.app.bankexample.repository.BankUserRepository;
import com.app.bankexample.service.BankService;


//@RunWith attaches a runner with the test class to initialize the test data
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BankControllerTests {
		
		private MockMvc mockMvc;
		
		@Autowired
		private WebApplicationContext wac;
		
		private final String apiPrefix = "/Bank";
		
		@Before
		public void setup() {
			this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		}
		
		//@MockBean annotation is used to create the mock object to be injected and using Mockito methods directly in the test class
		@MockBean
		BankService service;
		
		//@MockBean annotation is used to create the mock object to be injected and using Mockito methods directly in the test class
		@MockBean
		BankUserRepository repo;
		
		@Autowired
		BankUserController controller;
		
		// creating JSON for Bank Object
		private static String createBankInJson(String firstName, String lastName, Float balance, String acType) {
	        return "{ \"firstName\": \"" + firstName + "\", " +
	                            "\"lastName\":\"" + lastName + "\", " +
	                            "\"balance\":\"" + balance + "\", " +
	                            "\"acType\":\"" + acType + "\"}";
	    }
		
		// creating JSON for Bank Object
		private static String createBank2InJson(String firstName, String lastName, Float balance, String acType, Long acNo) {
	        return "{ \"firstName\": \"" + firstName + "\", " +
	                            "\"lastName\":\"" + lastName + "\", " +
	                            "\"balance\":\"" + balance + "\", " +
	                            "\"acType\":\"" + acType + "\", " +
	                            "\"acNo\":\"" + acNo + "\"}";
	    }
		
	
		@Test
		public void verifySuccessfullCreate() throws Exception
		{
			BankUser bankUser1=new BankUser(1l,"TestUserFirstName1","TestUserLastName1", 10000f,"TestAccountType");
			when(service.getFindByFirstName(anyObject())).thenReturn(bankUser1);
			mockMvc.perform(MockMvcRequestBuilders.post(apiPrefix + "/AddBankUser")
			.contentType(MediaType.APPLICATION_JSON)
			.content(createBankInJson("TestUserFirstName","TestUserLastName", 10000f,"TestAccountType"))
			.accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andDo(print());
		}
		
		
		
		@Test
		public void verifyGetMyDetails() throws Exception
		{
			BankUser bankUser=new BankUser("TestUserFirstName","TestUserLastName", 10000f,"TestAccountType"); 
			when(repo.findOne(anyLong())).thenReturn(bankUser);
			mockMvc.perform(MockMvcRequestBuilders.get(apiPrefix + "/GetMyDetails/{acNo}",anyLong()))
			.andExpect(status().isOk()).andDo(print());
		}
		
		
		@Test
		public void verifyShowAll() throws Exception
		{
			List<BankUser> list=new ArrayList<>();
			BankUser bankUser1=new BankUser("TestUserFirstName1","TestUserLastName1", 10000f,"TestAccountType"); 
			BankUser bankUser2=new BankUser("TestUserFirstName2","TestUserLastName2", 10000f,"TestAccountType");
			list.add(bankUser1);
			list.add(bankUser2);
			when(repo.findAll()).thenReturn(list);
			mockMvc.perform(MockMvcRequestBuilders.get(apiPrefix + "/AllBankUsers"))
			.andExpect(status().isOk()).andDo(print());
		}
		
		@Test
		public void verifyWithdraw() throws Exception
		{
			BankUser bankUser=new BankUser("TestUserFirstName","TestUserLastName", 10000f,"TestAccountType"); 
			when(repo.findOne(anyLong())).thenReturn(bankUser);
			when(repo.save(bankUser)).thenReturn(bankUser);
			mockMvc.perform(MockMvcRequestBuilders.post(apiPrefix + "/Withdraw")
			.contentType(MediaType.APPLICATION_JSON)
			.content(createBank2InJson("TestUserFirstName","TestUserLastName", 3000f,"TestAccountType", 3l))
			.accept(MediaType.APPLICATION_JSON)).andExpect(status().isAccepted()).andDo(print());
		}
		
		@Test
		public void verifyCredit() throws Exception
		{
			BankUser bankUser=new BankUser("TestUserFirstName","TestUserLastName", 10000f,"TestAccountType");
			when(repo.findOne(anyLong())).thenReturn(bankUser);
			mockMvc.perform(MockMvcRequestBuilders.post(apiPrefix + "/Credit")
			.contentType(MediaType.APPLICATION_JSON)
			.content(createBank2InJson("TestUserFirstName","TestUserLastName", 2000f,"TestAccountType",3l))
			.accept(MediaType.APPLICATION_JSON)).andExpect(status().isAccepted()).andDo(print());
		}

}
