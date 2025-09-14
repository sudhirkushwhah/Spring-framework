package com.spring.beans;

public class Labs {
	private int numberOfLabs;
	private String lab_Name;
	private int lab_Capacity;

	public int getNumberOfLabs() {
		return numberOfLabs;
	}

	public void setNumberOfLabs(int numberOfLabs) {
		this.numberOfLabs = numberOfLabs;
	}

	public String getLab_Name() {
		return lab_Name;
	}

	public void setLab_Name(String lab_Name) {
		this.lab_Name = lab_Name;
	}

	public int getLab_Capacity() {
		return lab_Capacity;
	}

	public void setLab_Capacity(int lab_Capacity) {
		this.lab_Capacity = lab_Capacity;
	}
	@Override
	public String toString() {
		return "labs :"+numberOfLabs +" Name :"+ lab_Name +" volume :"+ lab_Capacity;
	}

}
