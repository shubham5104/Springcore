package com.springcore.auto.wired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	
	@Autowired
	private Address address;
	

	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		System.out.println("setting value with constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
