package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Classes;
import com.spring.beans.configurfile.Configurfile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurfile.class);
        Classes classes = context.getBean(Classes.class);
        System.out.println("first school :"+classes.getSchool_Name());
        System.out.println("level :"+classes.getClass_Name());
        System.out.println(classes.getStudents());
       
        
      
    }
}
