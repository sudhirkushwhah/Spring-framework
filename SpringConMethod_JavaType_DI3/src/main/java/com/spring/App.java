package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.Employee;
import com.spring.bean.configuration.ConfiguratinEmp;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfiguratinEmp.class);
        Employee emp = context.getBean(Employee.class);
        emp.display();
    }
}
