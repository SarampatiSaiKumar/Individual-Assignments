package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootdemoApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext= SpringApplication.run(BootdemoApplication.class, args);
	Employee employee1 = (Employee) applicationContext.getBean("emp");
	Employee employee2 = (Employee) applicationContext.getBean("emp");
	Employee employee3 = (Employee) applicationContext.getBean("emp");
	Employee employee4 = (Employee) applicationContext.getBean("emp");
	System.out.println(employee1.hashCode());
	System.out.println(employee2.hashCode());
	System.out.println(employee3.hashCode());
	
	System.out.println(employee1);
	
	}

}


