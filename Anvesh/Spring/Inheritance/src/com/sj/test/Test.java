package com.sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.Inherit.Car;
import com.sj.Inherit.Sedan;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appContext = new ClassPathXmlApplicationContext("webx.xml");
		Sedan c=(Sedan) appContext.getBean("toursitcar");
		System.out.println("car color:"+c.getColor());
		System.out.println("car maker:"+c.getMake());
		System.out.println("car model:"+c.getModel());
		
		
	}

}
