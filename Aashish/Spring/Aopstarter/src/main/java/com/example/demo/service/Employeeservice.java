package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;

@Service
public class Employeeservice {

	public Employee createEmployee(@RequestParam String name,@RequestParam String empId) {
		Employee e = new Employee();
		e.setEmpId(empId);
		e.setName(name);
		return e;
	}
	public void deleteEmployee() {
		System.out.println("delete employee");
	}
	
}
