package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SpringBootApplication
public class Springassignment7Application {

	public static void main(String[] args) {
		ExpressionParser expressionparser=new SpelExpressionParser();
		
		Expression exp1=expressionparser.parseExpression("'SPEL example '");
		String message1=(String) exp1.getValue();
		Expression exp2=expressionparser.parseExpression("'SPEL example '.toUpperCase()");
		String message2=(String) exp2.getValue();
		Expression exp3=expressionparser.parseExpression("'SPEL example '.toLowerCase()");
		String message3=(String) exp3.getValue();
		
		System.out.println(message1+message2+message3);
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Project project =(Project) context.getBean("project");
		System.out.println(project.toString());
		
		
	}

}

