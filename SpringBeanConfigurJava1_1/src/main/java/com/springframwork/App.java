package com.springframwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springframwork.beans.Employee;
import com.springframwork.configur.EmployeeConfigur;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigur.class);
        
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp.getEmployeeName());
        System.out.println(emp.getEmployeeSurname());
        System.out.println(emp.getEmployeeSalary());
    }
}
