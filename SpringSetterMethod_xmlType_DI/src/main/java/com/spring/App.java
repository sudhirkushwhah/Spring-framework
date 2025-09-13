package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Battery;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String configurString = "ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configurString);
		Battery battery = (Battery) context.getBean("batId");
		battery.printBattery();
	}
}
