package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.Students;
import com.spring.beans.configurfile.Configurationfile;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurationfile.class);
        Students students = context.getBean(Students.class);
        
        System.out.println("student Name :"+students.getStu_Name());
        System.out.println("Roll No :"+students.getStu_RollNu());
        System.out.println("age :"+students.getAge());
        System.out.println("City :"+students.getAddress());
        
        
    }
}
