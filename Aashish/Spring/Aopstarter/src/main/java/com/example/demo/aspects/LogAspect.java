package com.example.demo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before(value =  "execution(* com.example.demo.service.Employeeservice.*(..)) and args(name,empId)")
	public void beforeAdvice(JoinPoint joinPoint,String name,String empId) {
		System.out.println("Before method :" + joinPoint.getSignature());
		System.out.println("Creating employee with name "+ name + " and id -" + empId);
		
	}
}
