package com.spring.beans;

public class MobilePhone {
	private String phone_Name;
	private String phone_Model;
	private double phone_price;
	private PhoneConfiguration phoneConfiguration;

	public void setPhone_Name(String phone_Name) {
		this.phone_Name = phone_Name;
	}

	public void setPhone_Model(String phone_Model) {
		this.phone_Model = phone_Model;
	}

	public void setPhone_price(double phone_price) {
		this.phone_price = phone_price;
	}

	public void setPhoneConfiguration(PhoneConfiguration phoneConfiguration) {
		this.phoneConfiguration = phoneConfiguration;
	}
	
	public void printMobilePhone() {
		System.out.println("Brand Name :"+phone_Name);
		System.out.println("Model :"+phone_Model);
		System.out.println("Price :"+phone_price);
		System.out.println("less Details :"+phoneConfiguration);
	}

}
