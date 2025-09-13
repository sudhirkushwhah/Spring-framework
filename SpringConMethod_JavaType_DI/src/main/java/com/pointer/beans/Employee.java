package com.pointer.beans;

public class Employee {
private String emp_Name;
private int emp_id;
private double emp_salary;
private Students students;

public Employee(String emp_Name, int emp_id, double emp_salary, Students students) {
	this.emp_Name=emp_Name;
	this.emp_id=emp_id;
	this.emp_salary=emp_salary;
	this.students=students;
}

public void display() {
	System.out.println("Employee name :"+emp_Name);
	System.out.println("Employee id :"+emp_id);
	System.out.println("Employee salary :"+emp_salary);
	System.out.println("students :"+students);
}
}
