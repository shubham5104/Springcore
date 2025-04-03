package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(name+"  Taking addmission");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println(name+"  Pass");
		
	}
	
	
}
