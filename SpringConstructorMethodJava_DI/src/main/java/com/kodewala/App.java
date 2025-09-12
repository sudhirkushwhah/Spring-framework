package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.beans.Academy;
import com.kodewala.beans.configur.Configurationfile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurationfile.class);
        Academy academy = (Academy) context.getBean(Academy.class);
        academy.printacademy();
    }
}
