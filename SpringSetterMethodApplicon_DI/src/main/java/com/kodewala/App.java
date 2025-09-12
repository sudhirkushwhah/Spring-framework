package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.beans.Liberary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String conString = "beans.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext(conString);
    	Liberary liberary = (Liberary) context.getBean("libId");
    	liberary.printLiberary();
    	
    }
}
