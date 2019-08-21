package com.vs.classes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vs.beans.Bean;

public class Test {
	public static void main(String args[]) {

		BeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("beanfile.xml"));
		Bean bean= (Bean) beanFactory.getBean("bean");
		bean.show();
		
	}

}
