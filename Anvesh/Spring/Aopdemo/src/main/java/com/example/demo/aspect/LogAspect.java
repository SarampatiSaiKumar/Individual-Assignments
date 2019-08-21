package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before(value="execution(* com.example.demo.service.EmployeeService.*(..)) and args(name,empid)")
	public void beforeAdvice(JoinPoint joinpoint, String name, String empid) {
		System.out.println("Befor method:"+ joinpoint.getSignature());
		System.out.println("creating employee with name:"+name+ " and id:" + empid);
	}
	
}
