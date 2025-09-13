package com.spring.beans;

public class Quantum {
	private String book_Name;
	private String book_Code;
	private double book_price;
	private Contents contents;
	
	public Quantum(String book_Name, String book_Code, double book_price, Contents contents) {
		this.book_Name = book_Name;
		this.book_Code = book_Code;
		this.book_price = book_price;
		this.contents = contents;
	}
	public void printBook() {
		System.out.println("bookName :"+book_Name);
		System.out.println("bookCode :"+book_Code);
		System.out.println("bookPrice :"+book_price);
		System.out.println("contents :"+contents);
		
	}

}
