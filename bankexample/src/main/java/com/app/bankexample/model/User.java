package com.app.bankexample.model;

public class User {

	String firstName;
	String lastName;
	Location location;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", location=" + location + "]";
	}
	
	
	
	
}
