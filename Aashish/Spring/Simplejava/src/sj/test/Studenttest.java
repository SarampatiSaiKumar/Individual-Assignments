package sj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import sj.model.Student;

public class Studenttest {

	public static void main(String[] args)
	{
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("aop1.xml"));
		Student myBean = (Student) beanFactory.getBean("StudentProxy");
		myBean.printName();
		System.out.println("*******");
		myBean.printCourse();
		System.out.println("*******");
		myBean.printRollno();
		
	}
}
 