package com.kodewala.beans;

public class Academy {
	private String academy_Name;
	private String academy_city;
	private Students students;
	
	public Academy(String academy_Name, String academy_city, Students students) {
		this.academy_Name = academy_Name;
		this.academy_city = academy_city;
		this.students = students;
	}
	
	public void printacademy() {
		System.out.println("AcademyName :"+academy_Name);
		System.out.println("AcademyCity :"+academy_city);
		System.out.println("Students :"+students);
	}

}
