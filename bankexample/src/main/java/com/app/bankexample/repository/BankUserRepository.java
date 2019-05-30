package com.app.bankexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bankexample.model.BankUser;

public interface BankUserRepository extends JpaRepository<BankUser, Long>{

	public List<BankUser> findByFirstName(String firstname);

}
