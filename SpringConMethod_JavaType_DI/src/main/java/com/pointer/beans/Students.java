package com.pointer.beans;

public class Students {
	private String stu_name;
	private int stu_rollNumber;
	
	public Students(String stu_name, int stu_rollNumber) {
		this.stu_name = stu_name;
		this.stu_rollNumber = stu_rollNumber;
	}
	@Override
	public String toString() {
		return stu_name + "   " +stu_rollNumber;
	}

}
