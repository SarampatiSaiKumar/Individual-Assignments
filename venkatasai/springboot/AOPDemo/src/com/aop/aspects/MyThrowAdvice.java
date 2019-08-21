package com.aop.aspects;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice implements ThrowsAdvice{

	public void afterThrowing(Exception e) {
		System.out.println("Exception is being thrown here");
		}
	
	
	
	
}
