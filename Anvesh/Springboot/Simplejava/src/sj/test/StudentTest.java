package sj.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import sj.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XmlBeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("aop1.xml"));
				
		Student mybean=(Student) beanfactory.getBean("StudentProxy");
		mybean.printname();
        System.out.println("-------------");
        mybean.printCourse();
        System.out.println("---------");
        mybean.printRollno();
        //mybean.printThrowException();
	}

}
