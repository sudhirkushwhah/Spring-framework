package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Students {
	private String stu_Name;
	private String stu_RollNo;
	private int age;
	@Autowired
	@Qualifier("adrobj1")
	private Address address;

	public String getStu_Name() {
		return stu_Name;
	}

	public void setStu_Name(String stu_Name) {
		this.stu_Name = stu_Name;
	}

	public String getStu_RollNo() {
		return stu_RollNo;
	}

	public void setStu_RollNo(String stu_RollNo) {
		this.stu_RollNo = stu_RollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString() {
		return "Name :"+stu_Name+", Roll No :"+stu_RollNo+", age :"+age+", addres :"+address;
	}

}
