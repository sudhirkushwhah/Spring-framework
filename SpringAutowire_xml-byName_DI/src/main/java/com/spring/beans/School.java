package com.spring.beans;

public class School {
	private String sch_Name;
	private String school_Location;
	private Labs labs;

	public String getSch_Name() {
		return sch_Name;
	}

	public Labs getLabs() {
		return labs;
	}

	public void setLabs(Labs labs) {
		this.labs = labs;
	}

	public void setSch_Name(String sch_Name) {
		this.sch_Name = sch_Name;
	}

	public String getSchool_Location() {
		return school_Location;
	}

	public void setSchool_Location(String school_Location) {
		this.school_Location = school_Location;
	}

}
