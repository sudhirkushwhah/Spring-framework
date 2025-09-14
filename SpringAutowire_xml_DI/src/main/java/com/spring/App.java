package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Liberary;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContex.xml");
        Liberary liberary = (Liberary) context.getBean("libId");
        System.out.println("libName :"+liberary.getLib_Name());
        System.out.println("city :"+liberary.getLib_city());
        System.out.println("Books available :"+liberary.getBooks());
        
    }
}
