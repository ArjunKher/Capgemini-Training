package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static MessageSource messageSource;
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Project project = (Project)context.getBean("project");
        System.out.println(project);
       
    }
}
