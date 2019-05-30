package com.app.bankexample.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bankexample.model.BankUser;

@Service
@Transactional
public interface BankService {

	public BankUser getFindByFirstName(BankUser bankuser);

}
