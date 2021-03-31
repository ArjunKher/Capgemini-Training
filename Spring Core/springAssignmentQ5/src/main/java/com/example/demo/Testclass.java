package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		VisitedPlaces place=(VisitedPlaces)context.getBean("VisitedPlaces");
		place.toStrings();
	}
}