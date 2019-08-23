package com.sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.cur.Currency;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext rf = new ClassPathXmlApplicationContext("webx.xml");
		Currency c=(Currency) rf.getBean("currency1");
		
		
		
	}

}
