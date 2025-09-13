package com.spring.beans;

public class Battery {
	private String battery_Brand;
	private double battery_Price;
	private Property property;

	public void setBattery_Brand(String battery_Brand) {
		this.battery_Brand = battery_Brand;
	}

	public void setBattery_Price(double battery_Price) {
		this.battery_Price = battery_Price;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public void printBattery() {
		System.out.println("Company :" + battery_Brand);
		System.out.println("Price :" + battery_Price);
		System.out.println("property :" + property);
	}

}
