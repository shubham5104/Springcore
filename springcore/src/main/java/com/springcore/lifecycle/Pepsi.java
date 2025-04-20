package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pepsi {

//	variable 
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(int price) {
		super();
		this.price = price;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Pepsi start drinking");
	}
	@PreDestroy
	public void finish() {
		System.out.println("Pepsi finish drinking");
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
}
