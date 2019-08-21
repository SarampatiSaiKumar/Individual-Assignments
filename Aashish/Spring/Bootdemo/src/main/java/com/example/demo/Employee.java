package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")

@Scope("prototype")   //to create different objects

@PropertySource("myresources.properties")     //create separate file in resources

public class Employee {
	
//	@Value("${uname}")     //application.properties set uname ="aashish"
	@Value("${myname.user}")
	private String name;
	
	@Value("21")    //used to assign value to variable
	private int age;
	
	private float salary;
	private String designation;
	
	@Autowired
	private Address address;
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation
				+ ", address=" + address + "]";
	}
	

}
