package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.demo.Test;

@SpringBootApplication
public class Springassignment8Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ((AbstractApplicationContext) context).registerShutdownHook();
        Test test = (Test) context.getBean("Test");
        System.out.println(context);
        System.out.println(test);
	}

}
