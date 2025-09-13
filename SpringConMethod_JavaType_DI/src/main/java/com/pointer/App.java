package com.pointer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pointer.beans.Employee;
import com.pointer.beans.configuratio.CongigurationEmp;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(CongigurationEmp.class);
       Employee  employee = context.getBean(Employee.class);
       employee.display();
    }
}
