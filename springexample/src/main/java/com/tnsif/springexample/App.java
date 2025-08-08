package com.tnsif.springexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("beancontext.xml");
	  Customer c1=(Customer) context.getBean("customer1");
  	  c1.display();
  }
}
