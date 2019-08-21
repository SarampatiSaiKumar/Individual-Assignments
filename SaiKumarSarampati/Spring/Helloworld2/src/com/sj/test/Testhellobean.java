package com.sj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.beans.HelloBean;

public class Testhellobean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("HelloBean.xml"));
		   HelloBean  bean1=(HelloBean)factory.getBean("bean1");
		   bean1.sayHello();
	}

}
