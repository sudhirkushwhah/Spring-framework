package com.springframwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframwork.bean.Liberary;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String config = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		Liberary liberary = (Liberary) context.getBean("libId");
		System.out.println("book name :" + liberary.getBookName());
		System.out.println("number of book is :" + liberary.getBookNumber());
		System.out.println("total price of book :" + liberary.getBookPrice());

		System.out.println("---------------");

		Liberary liberary2 = (Liberary) context.getBean("libId2");
		System.out.println("book name :" + liberary2.getBookName());
		System.out.println("number of book is :" + liberary2.getBookNumber());
		System.out.println("total price of book :" + liberary2.getBookPrice());

	}
}
