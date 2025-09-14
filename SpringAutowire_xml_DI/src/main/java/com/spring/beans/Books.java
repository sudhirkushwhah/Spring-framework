package com.spring.beans;

public class Books {
	private String book_type;
	private int numberOfbooks;

	public String getBook_type() {
		return book_type;
	}

	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}

	public int getNumberOfbooks() {
		return numberOfbooks;
	}

	public void setNumberOfbooks(int numberOfbooks) {
		this.numberOfbooks = numberOfbooks;
	}
	
	public String toString() {
		return "bookType :"+book_type+", number of books :"+numberOfbooks;
	}

}
