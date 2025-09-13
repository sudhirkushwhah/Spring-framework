package com.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Students {
	private String stu_Name;
	private int stu_RollNu;
	private int age;
	@Autowired
	@Qualifier("addr1")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStu_Name() {
		return stu_Name;
	}

	public void setStu_Name(String stu_Name) {
		this.stu_Name = stu_Name;
	}

	public int getStu_RollNu() {
		return stu_RollNu;
	}

	public void setStu_RollNu(int stu_RollNu) {
		this.stu_RollNu = stu_RollNu;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
