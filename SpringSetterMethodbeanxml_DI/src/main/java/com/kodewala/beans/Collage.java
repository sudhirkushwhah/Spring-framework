package com.kodewala.beans;

public class Collage {
	private String subName;
	private String subCode;
	private Students students;

	public void setSubName(String subName) {
		System.out.println("setter menthod subName");
		this.subName = subName;
	}

	public void setSubCode(String subCode) {
		System.out.println("setter menthod subCode");
		this.subCode = subCode;
	}

	public void setStudents(Students students) {
		System.out.println("setter menthod students");
		this.students = students;
	}
	
	public void display() {
		System.out.println("subName :"+ subName );
		System.out.println("subCode :"+ subCode);
		System.out.println("students are : "+students);
	}
	
	

}
