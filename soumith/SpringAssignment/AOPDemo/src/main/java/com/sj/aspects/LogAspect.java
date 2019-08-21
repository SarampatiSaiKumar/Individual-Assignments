package com.sj.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {

	@Before(value="execution(* com.sj.service.EmployeeService.*(..)) and args(name, empId)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name- " + name + "and id- "+empId);
	}
}
