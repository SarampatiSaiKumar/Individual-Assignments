package com.vs.aop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.vs.aop.models.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(@RequestParam String name, @RequestParam String id) {
		Employee employee = new Employee();
		
		employee.setEmpId(id);
		employee.setName(name);
		return employee;
	}
	
	public void deleteEmployee (@RequestParam String id) {
		System.out.println("Deleting employee "+id);
	}
	
	
	
}
