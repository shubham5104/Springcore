package com.springcore.standcollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standcollections/aloneconfig.xml");
		
		Person per1= (Person) context.getBean("per1");
		Person per2= (Person) context.getBean("per2");
		
		System.out.println(per1);
		System.out.println(per1.getFriends().getClass().getName());
		
		System.out.println(per2);
		System.out.println(per2.getFriends().getClass().getName());
	}

}
