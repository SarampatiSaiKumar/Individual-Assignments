package com.sj.bean.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lifetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beanx.xml");
         
		 context.getBean("beanlc");
		  
         context.close();
	}

}
