package com.springcore.auto.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wired/autoconfig.xml");
		
		Emp emp1= (Emp) context.getBean("emp1");
		System.out.println(emp1);
	}

}
