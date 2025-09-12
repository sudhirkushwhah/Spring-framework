package com.kodewala.bean.configur;

import java.awt.print.Book;

import org.springframework.context.annotation.Bean;

import com.kodewala.beans.Books;
import com.kodewala.beans.Liberary;
@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public Liberary liberaryObj() {
	 Liberary lib = new Liberary("Kodewala", "Bengloure", booksObj());
	 return lib;
 }
	@Bean
	public Books booksObj() {
		Books books = new Books("Java", "KCS452", 428);
		return books;
	}
	

}
