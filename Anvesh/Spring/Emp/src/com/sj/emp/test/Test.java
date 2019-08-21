package com.sj.emp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.emp.Emp;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory bean = new XmlBeanFactory(new ClassPathResource("Empx.xml"));
		Emp emp = (Emp) bean.getBean("empBean");
		 System.out.println("the id is" + emp.getId());
		 System.out.println("The name is "+ emp.getName());
		 emp.printDept();
	}

}
