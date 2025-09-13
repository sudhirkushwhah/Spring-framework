package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Quantum;
import com.spring.beans.configur.ConfigurationBook;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBook.class);
		Quantum newQuantum = context.getBean(Quantum.class);
		newQuantum.printBook();
	}
}
