package com.sj.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyMethodThrowsAdvice implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("Captured ThrowException :" +e );
	}

}
