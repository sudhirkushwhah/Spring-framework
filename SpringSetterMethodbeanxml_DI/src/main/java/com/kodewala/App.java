package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.beans.Collage;


public class App 
{
    public static void main( String[] args )
    {
    	String conString = "beans.xml";
    	ApplicationContext context = new ClassPathXmlApplicationContext(conString);
        Collage collage = (Collage) context.getBean("colId");
        collage.display();
    }
}
