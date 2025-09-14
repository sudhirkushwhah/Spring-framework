package com.spring.beans;

public class TestingShell {
	private int total_emp;
	private String department_Name;

	public void setTotal_emp(int total_emp) {
		this.total_emp = total_emp;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}
	@Override
	public String toString() {
		return total_emp + "   "+department_Name;
	}

}
