package com.kodewala.beans;

public class Students {
	private String stuName;
	private int stuId;

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	@Override
	public String toString() {
		return "studentName :" +stuName + ",studentid :"+stuId;
	}

}
