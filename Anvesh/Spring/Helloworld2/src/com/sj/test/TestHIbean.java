package com.sj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.beans.Helloconstr;

public class TestHIbean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("HelloBean.xml"));
		   Helloconstr  bean=(Helloconstr)factory.getBean("bean2");
		   bean.sayHi();

	}

}
