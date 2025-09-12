package com.kodewala.beans;

public class Books {
	private String book_Name;
	private String book_Code;
	private int book_price;

	public Books(String book_Name, String book_Code, int book_price) {
		this.book_Name = book_Name;
		this.book_Code = book_Code;
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "book_Name :" + book_Name + ", bookCode :" + book_Code + ", bookPrice :" + book_price;
	}
}
