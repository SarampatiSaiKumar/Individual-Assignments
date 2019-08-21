package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {

	@Autowired
	EmpDBDao dao;
	
	@RequestMapping("/")

	public String welcome()
	{
		return "welcome.jsp";
	}
	@RequestMapping("/displayall")
	@ResponseBody
	public String displayAllEmployees() {
		
		return dao.findAll().toString();
		
	}
	@RequestMapping("/displayEmp")
	@ResponseBody
	public Optional<Employee> displayEmployee(@RequestParam int eid) {
		
		return dao.findById(eid);
		
	}
	@RequestMapping("/displaybyDesig")
	@ResponseBody
	public String displaybydesignation(@RequestParam String designation) {
		
		return dao.findByDesignation(designation).toString();
		
	}
	
	

@RequestMapping("/displayByAge")
@ResponseBody
public List<Employee> displayEmpByAge(@RequestParam String designation) {
	
	return dao.getEmpsInSortedByAge(designation);
	
}

@RequestMapping("/insertEmp")
@ResponseBody
public String createEmployee(Employee emp) {
	
	dao.save(emp);
	return "Successfully inserted record";
	
}

/*@RequestMapping("/collect")
public String demo(Employee emp) {
	
	dao.save(emp);
	return "Successfully inserted record";
	
}
*/
@RequestMapping("/updateEmp")
@ResponseBody
public String updateEmployee(Employee emp) {
	int eid=emp.getId();
	if(dao.existsById(eid)) {
	dao.save(emp);
	
	return "Successfully updated  record";
	}
	return "sorry invalid id";
}
@RequestMapping("/deleteEmp")
@ResponseBody
public String deleteEmployee(@RequestParam int eid) {
	
	if(dao.existsById(eid)) {
	dao.deleteById(eid);
	
	return "Successfully delete  record";
	}
	return "sorry invalid id";
}

}
