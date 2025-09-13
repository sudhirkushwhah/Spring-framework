package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.MobilePhone;
import com.spring.beans.configur.ConfigurPhone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurPhone.class);
        MobilePhone mobilePhone = context.getBean(MobilePhone.class);
        mobilePhone.printMobilePhone();
    }
}
