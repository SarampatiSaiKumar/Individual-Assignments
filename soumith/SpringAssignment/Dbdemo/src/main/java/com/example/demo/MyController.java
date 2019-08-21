package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@Autowired
	EmpDBDao dao;
	@RequestMapping("/")
	public String welcome()
	{
		return "welcome.jsp";
	}
	
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAllEmployees()
	{
		return dao.findAll().toString();
	}
	
	@RequestMapping("/Find")
	@ResponseBody
	public Optional<Employee> findAnEmployee(@RequestParam int eid)
	{
		return dao.findById(eid);
	}
	
	@RequestMapping("/displayByDesig")
	@ResponseBody
	public String displayByDesignation(@RequestParam String designation)
	{
		return dao.findByDesignation(designation).toString();
	}
	
	@RequestMapping("/displayByAge")
	@ResponseBody
	public String displayByAge(@RequestParam String designation)
	{
		return dao.getEmpsInSorterByAge(designation).toString();
	}
	
	@RequestMapping("/insertEmp")
	@ResponseBody
	public String createEmployee(Employee emp)
	{
		dao.save(emp);
		return "Successfully inserted ";
	}
}
