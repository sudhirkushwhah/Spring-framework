package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.School;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String conString ="ApplicationContex.xml";
       ApplicationContext context = new ClassPathXmlApplicationContext(conString);
       School school = (School) context.getBean("schId");
       System.out.println("school Name :"+school.getSch_Name());
       System.out.println("location :"+school.getSchool_Location());
       System.out.println("number :"+school.getLabs());
    }
}
