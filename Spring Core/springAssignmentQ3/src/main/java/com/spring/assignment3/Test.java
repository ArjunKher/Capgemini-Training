package com.spring.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test 
{
	
	
	
	@Bean
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BankAccountController b = (BankAccountController)context.getBean("BankAccountController");
        b.deposit(62839L,1000000);
        b.getBalance(62839L);
    }}