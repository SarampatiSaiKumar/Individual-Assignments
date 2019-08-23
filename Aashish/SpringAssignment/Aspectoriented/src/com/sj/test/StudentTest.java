package com.sj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.model.Student;
import com.sun.org.apache.bcel.internal.util.ClassPath;

public class StudentTest {

	public static void main (String[] args) {
		
		XmlBeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("beans.xml"));
		Student myBean = (Student) beanFactory.getBean("StudentProxy");
		myBean.printName();
		System.out.println("-----");	
	myBean.printCourse();
	System.out.println("-----");
	myBean.printRollno();
	//myBean.printThrowException();
	}
}
