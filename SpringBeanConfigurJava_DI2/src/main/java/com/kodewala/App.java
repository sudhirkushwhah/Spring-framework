package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.configur.Configuration;
import com.kodewala.beans.Liberary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        
        Liberary liberary = (Liberary) context.getBean(Liberary.class);
        liberary.printLiberary();
    }
}
