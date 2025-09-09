package com.mt.countstock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	String conString = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(conString);
        
        Orders orders = (Orders) context.getBean("ordId");
        System.out.println("order products are : "+orders.getOrderitem());
        System.out.println("total number of products are : "+orders.getNumberOfItem());
        
    }
}
