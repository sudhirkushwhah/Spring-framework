package com.kodewala.beans;

public class Students {
	private String students_Name;
	private String students_Branch;
	private String students_City;

	public Students(String students_Name, String students_Branch, String students_City) {
		this.students_Name = students_Name;
		this.students_Branch = students_Branch;
		this.students_City = students_City;
	}

	@Override
	public String toString() {
		return "StuName :" + students_Name + ", stuBranch :" + students_Branch + ", stuCity :" + students_City;
	}
}
