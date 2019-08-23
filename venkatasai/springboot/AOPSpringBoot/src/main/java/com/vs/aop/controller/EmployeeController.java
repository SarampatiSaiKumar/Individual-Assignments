package com.vs.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vs.aop.models.Employee;
import com.vs.aop.service.EmployeeService;
@RestController
@RequestMapping("/web")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/add/employee")
	public Employee createEmployee(@RequestParam String name,@RequestParam String id) {
		
		return employeeService.createEmployee(name, id);
		
	}
}
