package com.sj;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sj.I18N.MVCInternational;

public class LocalTestcase {

	public LocalTestcase() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		AbstractApplicationContext appcon=new ClassPathXmlApplicationContext("beans.xml");
		MVCInternational in=(MVCInternational)appcon.getBean("localisation");
		in.getMsg();
	}
}
