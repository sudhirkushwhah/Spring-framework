package com.kodewala.beans;

public class Books {
	private String books_name;
	private String books_code;
	private double books_price;

	public String getBooks_name() {
		return books_name;
	}

	public void setBooks_name(String books_name) {
		this.books_name = books_name;
	}

	public String getBooks_code() {
		return books_code;
	}

	public void setBooks_code(String books_code) {
		this.books_code = books_code;
	}

	public double getBooks_price() {
		return books_price;
	}

	public void setBooks_price(double books_price) {
		this.books_price = books_price;
	}
	@Override
	public String toString() {
		return "bookName :"+books_name+
				", bookcode :"+books_code+ 
				", bookprice :"+books_price; 
	}

}
