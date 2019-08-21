package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {

	@Autowired
	EmpDBDao dao;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return dao.findAll();
	}
	
	@PostMapping("/employees")
	public String insertEmp(@RequestBody Employee emp)
	{
		dao.save(emp);
		return "success";
	}
	
}
	


