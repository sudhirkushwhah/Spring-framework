package com.spring.beans;

public class ITShell {
	private String department;
	private String empa_Id;
	private TestingShell testingShell;

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmpa_Id(String empa_Id) {
		this.empa_Id = empa_Id;
	}

	public void setTestingShell(TestingShell testingShell) {
		this.testingShell = testingShell;
	}
	
	@Override
	public String toString() {
		return "depart :" +department+" id :"+empa_Id+ "   "+testingShell;
	}

}
