package com.spring.beans;

public class BatteryItem {
	private String bat_Brand;
	private double bat_Price;
	private Property property;

	public BatteryItem(String bat_Brand, double bat_Price, Property property) {
		this.bat_Brand = bat_Brand;
		this.bat_Price = bat_Price;
		this.property = property;
	}

	public void displayBat() {
		System.out.println("Company :" + bat_Brand);
		System.out.println("battery price :" + bat_Price);
		System.out.println("property :" + property);

	}
}
