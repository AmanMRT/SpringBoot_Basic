package com.aman.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Car obj = (Car) context.getBean("car");
    	obj.drive();
         	
//    	Tyre t = (Tyre)context.getBean("Tyre");
//    	System.out.println(t);
    }
}
