package com.printing.word;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	String conString = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(conString);
        
        Sentences sentences = (Sentences) context.getBean("senId");
        
        System.out.println("first word : "+sentences.getFirstWord());
        System.out.println("second word : "+sentences.getSecondword());
    }
}
