package com.app.bankexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app.bankexample")

public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);

	}
}
