package com.springframwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Pens pens = (Pens) context.getBean("penId");
        System.out.println("pen brand name :"+pens.getPenName());
        System.out.println("number of pens :"+pens.getNumberOfPens());
        System.out.println("price :"+pens.getPenPrice());
        System.out.println("=============");
        Pens pens2 = (Pens) context.getBean("penId2");
        System.out.println("pen brand name :"+pens2.getPenName());
        System.out.println("number of pens :"+pens2.getNumberOfPens());
        System.out.println("price :"+pens2.getPenPrice());
        System.out.println("================");
        Pens pens3 = (Pens) context.getBean("penId3");
        System.out.println("pen brand name :"+pens3.getPenName());
        System.out.println("number of pens :"+pens3.getNumberOfPens());
        System.out.println("price :"+pens3.getPenPrice());
    }
}
