package com.aop.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aop.models.Student;


public class StudentTest {
	
	public static void main(String[] args) {
		
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("aop1.xml"));
		
		Student myBean = (Student) beanFactory.getBean("StudentProxy");
		
		myBean.printName();
		System.out.println("-----");	
		myBean.printCourse();
		System.out.println("-----");
		myBean.printRollNo();
		System.out.println("-----");
		myBean.printThrowException();
	
	}

}
