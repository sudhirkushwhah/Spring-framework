package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Employee;
import com.kodewala.config.configurjava;
import com.kodewala.service.copy.Employeeservice;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(configurjava.class);
        
        Employee employee = (Employee) context.getBean("emp1");
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        
        Employee employee2 = (Employee) context.getBean("emp2");
        System.out.println(employee2.getFirstName());
        System.out.println(employee2.getLastName());
        
        Employeeservice empser = context.getBean(Employeeservice.class);
        empser.printEmployee();
    }
}
