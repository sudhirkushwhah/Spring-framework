package com.kodewala.beans;

public class Liberary {
	private String lib_Name;
	private String lib_location;
	private Books books;

	public void setLib_Name(String lib_Name) {
		this.lib_Name = lib_Name;
	}

	public void setLib_location(String lib_location) {
		this.lib_location = lib_location;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	
	public void printLiberary() {
		System.out.println("liberary Name :" + lib_Name);
		System.out.println("liberay Location :"+lib_location);
		System.out.println("available :"+books);
	}

}
