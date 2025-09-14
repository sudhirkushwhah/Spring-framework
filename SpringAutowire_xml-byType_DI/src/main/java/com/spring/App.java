package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String contextString = "ApplicationContex.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(contextString);
        Employee employee = (Employee) context.getBean("empId");
        employee.printEmp();
    }
}
