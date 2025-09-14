package com.spring.beans;

public class Employee {
	private int emp_Id;
	private String emp_Name;
	private ITShell itShell;

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public void setItShell(ITShell itShell) {
		this.itShell = itShell;
	}
	
	public void printEmp() {
		System.out.println("id :"+emp_Id);
		System.out.println("name :"+emp_Name);
		System.out.println("It :"+itShell);
	}

}
