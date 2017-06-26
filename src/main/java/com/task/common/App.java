package com.task.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
	String test = "0000000450";
	System.out.println(test.replaceFirst("^0+(?!$)", ""));
	
	
	test = "+ 5555500";
	
	System.out.println(test.replaceFirst("^.|.$", ""));
	
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Scheduler.xml");
    
    }
}
