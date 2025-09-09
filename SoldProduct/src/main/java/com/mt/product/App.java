package com.mt.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mt.product.sold.ItemSold;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String itembagString = "ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(itembagString);
        
        ItemSold itemSold = (ItemSold) context.getBean("itmSol");
        
        System.out.println("product name :"+itemSold.getItemsold());
        System.out.println("model number of product :"+itemSold.getModelNumber());
        System.out.println("number of item :"+itemSold.getNumberOfProducts());
        System.out.println("price of each item :"+itemSold.getPrice());
        
        
       
        
    }
}
