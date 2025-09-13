package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Classes {
	private String school_Name;
	private String class_Name;
	@Autowired
	private Students students;

	public String getSchool_Name() {
		return school_Name;
	}

	public void setSchool_Name(String school_Name) {
		this.school_Name = school_Name;
	}

	public String getClass_Name() {
		return class_Name;
	}

	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}

	public Students getStudents() {
		return students;
	}

	public void setStudents(Students students) {
		this.students = students;
	}

}
