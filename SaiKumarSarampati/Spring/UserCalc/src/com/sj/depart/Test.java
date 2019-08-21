/**
 * 
 */
package com.sj.depart;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Abridge
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory rf = new XmlBeanFactory(new ClassPathResource("mycalc.xml"));
	Emp	emp = (Emp)rf.getBean("emp");
		System.out.println(emp.getName());
	}

}
