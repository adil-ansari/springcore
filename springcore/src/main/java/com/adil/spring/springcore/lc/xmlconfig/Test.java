package com.adil.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/adil/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
	}
}
