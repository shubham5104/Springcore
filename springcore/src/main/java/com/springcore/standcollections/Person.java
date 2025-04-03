package com.springcore.standcollections;

import java.util.List;
import java.util.Map;

public class Person {

	private List<String> friends;
	private Map<String, Double> fees;
	

	public Map<String, Double> getFees() {
		return fees;
	}

	public void setFees(Map<String, Double> fees) {
		this.fees = fees;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + "]";
	}

	
	
	
}
