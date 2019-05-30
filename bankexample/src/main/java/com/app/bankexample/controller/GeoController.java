package com.app.bankexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.bankexample.model.Location;
import com.app.bankexample.model.User;
import com.app.bankexample.service.GeoService;



@RestController
public class GeoController {

	@Autowired
	private GeoService service;
	
	@GetMapping("/getLocation/{place}")
	public ResponseEntity<User> getUser(@PathVariable("place") String place){
		User user=new User("TestUserFirstName", "TestUserLastName");
		Location location=service.getLocation(place);
		user.setLocation(location);
			return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
}
