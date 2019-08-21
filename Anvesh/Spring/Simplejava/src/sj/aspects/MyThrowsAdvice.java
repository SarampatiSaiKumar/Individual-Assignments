package sj.aspects;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterthrowing(IllegalArgumentException e) throws Throwable{
		
		System.out.println("capture exception:throw Exception is created");
	}
}
