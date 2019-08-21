package com.vs.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecuritySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritySpringApplication.class, args);
		
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashedPassword = "";
		hashedPassword = encoder.encode("areysamba");
		System.out.println("areysamba   -- > " + hashedPassword.toString());



	}
	
	

}
