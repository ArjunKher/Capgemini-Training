package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Springassignment10Application implements ApplicationContextAware{
    private ApplicationContext applicationContext;
    
    
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
	public void display()
	{
		
		Test test=(Test)applicationContext.getBean("test");
		System.out.println(test.getQuestionid());
	}
	

}
