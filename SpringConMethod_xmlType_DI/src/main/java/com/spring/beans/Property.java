package com.spring.beans;

public class Property {
	private String capacity;
	private String warrenty;
	
	public Property(String capacity, String warrenty) {
		this.capacity = capacity;
		this.warrenty = warrenty;
	}
	
	public String toString() {
		return capacity +"\n" +"Warrenty :"+warrenty;
	}
	
	
}
