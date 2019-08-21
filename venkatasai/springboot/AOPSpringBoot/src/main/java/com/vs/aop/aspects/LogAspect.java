package com.vs.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Before(value = "execution(* com.vs.aop.service.EmployeeService..*(..)) and args( name, empId )")
	public void beforeAdvice(JoinPoint joinpoint,String name, String id) {
		System.out.println("Before method: " + joinpoint.getSignature());
	}
}

