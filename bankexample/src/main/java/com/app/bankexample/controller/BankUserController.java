package com.app.bankexample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.bankexample.model.BankUser;
import com.app.bankexample.repository.BankUserRepository;
import com.app.bankexample.service.BankService;

@RestController
@RequestMapping("/Bank")
public class BankUserController {
	
	@Autowired
	private BankUserRepository repo;
	
	@Autowired
	private BankService service;
	
	@PostMapping("/AddBankUser")
	public ResponseEntity<BankUser> create(@RequestBody BankUser bankUser){
		
		BankUser bankuser1=service.getFindByFirstName(bankUser);
		
		if(bankuser1 != null)
		{
			return new ResponseEntity<>(bankUser, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<>(bankUser, HttpStatus.IM_USED);
		}
	}
	
	@GetMapping("/GetMyDetails/{acNo}")
	public ResponseEntity<BankUser> showDetails(@PathVariable(value="acNo") Long acNo)
	{
		try
		{
			BankUser bankuser=repo.findOne(acNo);
			return new ResponseEntity<>(bankuser,HttpStatus.OK);
		}
		catch(NullPointerException e)
		{
			BankUser bankuser=null;
			return new ResponseEntity<>(bankuser,HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/AllBankUsers")
	public ResponseEntity<List<BankUser>> showall()
	{
		List<BankUser> list=repo.findAll();
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	
	@PostMapping("/Withdraw")
	public ResponseEntity<BankUser> getWithdraw(@RequestBody BankUser bankuser1)
	{
		if(bankuser1.getAcNo()==null || bankuser1.getBalance()==null)
		{
			return new ResponseEntity<>(bankuser1, HttpStatus.BAD_REQUEST);
		}
		else
		{
			try
			{
				BankUser bankuser=repo.findOne(bankuser1.getAcNo());
	
				if(bankuser.getBalance() < bankuser1.getBalance())
				{
					return new ResponseEntity<>(bankuser, HttpStatus.BAD_REQUEST);
				}
				else
				{
					float newBalance=bankuser.getBalance() - bankuser1.getBalance();
					bankuser.setBalance(newBalance);
					repo.save(bankuser);
					return new ResponseEntity<>(bankuser, HttpStatus.ACCEPTED);
				}
					
			}
			catch(NullPointerException e)
			{
				return new ResponseEntity<>(bankuser1, HttpStatus.BAD_REQUEST);
				
			}
		}
	}
	
	@PostMapping("/Credit")
	public ResponseEntity<BankUser> getAddCash(@RequestBody BankUser bankuser1)
	{
		if(bankuser1.getAcNo()==null || bankuser1.getBalance()==null)
		{
			return new ResponseEntity<>(bankuser1, HttpStatus.BAD_REQUEST);
		}
		else
		{
			try
			{
				BankUser bankuser=repo.findOne(bankuser1.getAcNo());
				if(bankuser != null)
				{
					float newBalance = bankuser.getBalance() + bankuser1.getBalance();
					bankuser.setBalance(newBalance);
					repo.save(bankuser);
					return new ResponseEntity<>(bankuser, HttpStatus.ACCEPTED);
				}
				else
				{
					return new ResponseEntity<>(bankuser, HttpStatus.NOT_FOUND);
				}
			}
			catch(NullPointerException e)
			{
				BankUser bankuser=null;
				return new ResponseEntity<>(bankuser, HttpStatus.NOT_FOUND);
				
			}
		}
	}
}
