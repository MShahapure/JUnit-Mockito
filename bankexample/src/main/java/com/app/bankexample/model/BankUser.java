package com.app.bankexample.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankUser implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long acNo;
	
	String firstName;
	String lastName;
	Float balance;
	String acType;
	
	public BankUser()
	{
		
	}
	
	public BankUser(String firstName, String lastName, Float balance, String acType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.acType = acType;
	}
	

	public BankUser(Long acNo, String firstName, String lastName, Float balance, String acType) {
		super();
		this.acNo = acNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.acType = acType;
	}

	public Long getAcNo() {
		return acNo;
	}

	public void setAcNo(Long acNo) {
		this.acNo = acNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	@Override
	public String toString() {
		return "BankUser [acNo=" + acNo + ", firstName=" + firstName + ", lastName=" + lastName + ", balance=" + balance
				+ ", acType=" + acType + "]";
	}
	
	

}
