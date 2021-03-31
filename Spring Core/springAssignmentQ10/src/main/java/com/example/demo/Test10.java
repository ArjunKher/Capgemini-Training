package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10 {
	public static void main(String[] args)
	{
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Springassignment10Application application=(Springassignment10Application)context.getBean("applicationContextAware");
    application.display();
	context.registerShutdownHook();
	}

}
