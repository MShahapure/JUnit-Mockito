package com.app.bankexample.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bankexample.model.BankUser;
import com.app.bankexample.repository.BankUserRepository;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	private BankUserRepository repo;
	
	@Override
	public BankUser getFindByFirstName(BankUser bankuser)
	{	
		try
		{
			List<BankUser> list=repo.findByFirstName(bankuser.getFirstName());
			Set<String> set=new HashSet<>();
			for(BankUser bankuser1:list)
			{
				String lName=bankuser1.getLastName();
				set.add(lName);
			}
			if(set.contains(bankuser.getLastName()))
			{
				return null;							
			}
			else
			{
				repo.save(bankuser);
				return 	bankuser;
			}
		}
		catch(NullPointerException e)
		{
			repo.save(bankuser);
			return 	bankuser;	
		}
	}
}
