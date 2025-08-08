package com.tnsif.springcoretwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  //loads the configuration file
	  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	  //call the getBean
	  College college = context.getBean("college", College.class);
	  college.showCollegeDetails();
  }
}
