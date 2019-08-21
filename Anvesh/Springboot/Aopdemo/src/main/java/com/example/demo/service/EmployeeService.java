/**
 * 
 */
package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;

/**
 * @author Abridge
 *
 */
@Service
public class EmployeeService {

	public Employee createEmployee( String name, String empid) {
		
		Employee e= new Employee();
		e.setEmpid(empid);
		e.setName(name);
		return e;
		
		
	}
	
	public void deleteEmployee(@RequestParam String empid) {
		
		System.out.println("delete employee:"+empid);
	}
}
