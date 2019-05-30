package com.app.bankexample;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.app.bankexample.model.BankUser;
import com.app.bankexample.repository.BankUserRepository;
import com.app.bankexample.service.BankServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BankServiceTests 
{
	
	@MockBean
	BankUserRepository repo;
	
	@Autowired
	BankServiceImpl service ;
	
	@Test
	public void verifyGetFindByFirstName()
	{
		BankUser bankuser=new BankUser("TestUserFirstName1","TestUserLastName1", 10000f,"TestAccountType");
		BankUser bankuser2=new BankUser("TestUserFirstName2","TestUserLastName2", 10000f,"TestAccountType");
		BankUser bankuser1=new BankUser("TestUserFirstName3","TestUserLastName3", 10000f,"TestAccountType");
		List<BankUser> list=new ArrayList<>();
		list.add(bankuser1);
		list.add(bankuser2);
		when(repo.findByFirstName(anyString())).thenReturn(list);
		assertNotNull(service.getFindByFirstName(bankuser));
	}

}
