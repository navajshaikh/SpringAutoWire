package com.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	 public static void main( String[] args )
	    {
	        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	        Person obj=  (Person) ac.getBean("p");
	       System.out.println(obj);
	        ac.close(); 
	    }

	 
}
