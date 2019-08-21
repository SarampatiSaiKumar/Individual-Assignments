package com.sj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sj.model.Employee;
import com.sj.service.EmployeeService;

@RestController
@RequestMapping("/web")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping(value="/employees")
	public Employee createEmployee(@RequestParam String name, @RequestParam String empId) {
		return service.createEmployee(name, empId);
	}
	
	/*@GetMapping(value="/viewemployees")
	public String viewemp() {
		String str= service.viewEmployee();
		return str;
	}*/
	
}
