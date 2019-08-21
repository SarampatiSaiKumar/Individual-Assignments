package com.sj.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.sj.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee( String name, String empId) {
		
		Employee e= new Employee();
		e.setEmpId(empId);
		e.setName(name);
		
		return e;
		
	}
	
public String viewEmployee() {
		
		Employee e= new Employee();
		return e.toString();
		
	}
	
	public void deleteEmployee( String empId) {
		System.out.println("Deleting employee: " +empId);
	}
}
