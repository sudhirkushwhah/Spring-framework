package com.kodewala.beans;

public class Liberary {
	private String lib_Name;
	private String lib_location;
	private Books books;

	public Liberary(String lib_Name, String lib_location, Books books) {
		this.lib_Name = lib_Name;
		this.lib_location = lib_location;
		this.books = books;
	}
	
	public void printLiberary() {
		System.out.println("Liberary Name :"+lib_Name);
		System.out.println("Liberary Location :"+lib_location);
		System.out.println("Books :"+books);
	}

}
