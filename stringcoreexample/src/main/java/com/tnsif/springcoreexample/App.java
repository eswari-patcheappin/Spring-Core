package com.tnsif.springcoreexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//It reads and manages the beans
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");//ApplicationContext is the IOC ccontainer
    	
    	College college = (College) context.getBean("collegeBean"); 
    	college.show();
    	// if we use new means that is tight coupling not use new means that is loose coupling 
    }
}
