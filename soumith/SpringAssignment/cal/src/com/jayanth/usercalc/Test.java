/**
 * 
 */
package com.jayanth.usercalc;

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
		User user = (User)rf.getBean("user");
		user.addFromCalc(11, 12);
	}

}
