package com.spring.beans;

public class Property {
	private String batter_Capacity;
	private String battery_Warrenty;

	public void setBatter_Capacity(String batter_Capacity) {
		this.batter_Capacity = batter_Capacity;
	}

	public void setBattery_Warrenty(String battery_Warrenty) {
		this.battery_Warrenty = battery_Warrenty;
	}

	public String toString() {
		return batter_Capacity + "\n" + "Warrenty :" + battery_Warrenty;
	}

}
