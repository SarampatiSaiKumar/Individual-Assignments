package com.sj.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Method Name :" + methodInvocation.getMethod().getName() );
		
		System.out.println("Method Arguments : " +Arrays.toString(methodInvocation.getArguments()));
		
		try {
			Object result = methodInvocation.proceed();
			System.out.println("While return");
			return result;
		}
		catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("MyAroundMethod : Throw exception");
			throw e;
		}
	}

}
