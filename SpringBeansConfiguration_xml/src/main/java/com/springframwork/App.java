package com.springframwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String conString = "beans.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(conString);

		ElectricStore electricStore = (ElectricStore) context.getBean("eleId");
		System.out.println("mobile brand :"+electricStore.getMobilePhone());
		System.out.println("model number : "+electricStore.getMobileModel());
		System.out.println("price : "+electricStore.getPrice());
		
		System.out.println("------------");
		
		ElectricStore electricStore2 = (ElectricStore) context.getBean("eleId2");
		System.out.println("mobile brand :"+electricStore2.getMobilePhone());
		System.out.println("model number : "+electricStore2.getMobileModel());
		System.out.println("price : "+electricStore2.getPrice());
		
		System.out.println("-------------");
		
		ElectricStore electricStore3 = (ElectricStore) context.getBean("eleId3");
		System.out.println("mobile brand :"+electricStore3.getMobilePhone());
		System.out.println("model number : "+electricStore3.getMobileModel());
		System.out.println("price : "+electricStore3.getPrice());
	}
}
