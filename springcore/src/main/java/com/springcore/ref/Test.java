package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");

		Student st=(Student) context.getBean("student");
		
		System.out.println("Student Id   : "+st.getId());
		System.out.println("Student Name : "+st.getName());
		System.out.println("Pincode      : "+st.getAddress().getPin());
		System.out.println("City         : "+st.getAddress().getCity());

	}

}
