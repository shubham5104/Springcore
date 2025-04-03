package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");

		context.registerShutdownHook();
//		Samosa sm1=(Samosa) context.getBean("sm1");
//		
//		System.out.println(sm1);
//		
//		Student s1=(Student)context.getBean("s1");
//		System.out.println(s1);
		
		Pepsi p1 =(Pepsi) context.getBean("p1");
		System.out.println(p1);
	}

}
