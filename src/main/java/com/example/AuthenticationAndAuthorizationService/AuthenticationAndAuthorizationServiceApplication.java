package com.example.AuthenticationAndAuthorizationService;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticationAndAuthorizationServiceApplication {

	public static void main(String[] args) {
		//for stop log4j error
		BasicConfigurator.configure();

		SpringApplication.run(AuthenticationAndAuthorizationServiceApplication.class, args);
	}

}
