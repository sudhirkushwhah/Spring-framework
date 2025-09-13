package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.BatteryItem;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BatteryItem batteryItem = (BatteryItem) context.getBean("batId");
		batteryItem.displayBat();
	}
}
