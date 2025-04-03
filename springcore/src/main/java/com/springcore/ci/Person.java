package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int id;
	private List<String> phones;
	
	public Person(String name, int id, List<String> phones) {

		this.name=name;
		this.id=id;
		this.phones=phones;
		
	}
	@Override
	public String toString() {
		return "Name :  "+this.name+"   Id  : "+this.id+"  Phone No. :  "+phones;
	}
}
