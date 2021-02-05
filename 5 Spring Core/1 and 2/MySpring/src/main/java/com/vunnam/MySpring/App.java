package com.vunnam.MySpring;

/**
 * 
 * @author Chowdary
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    public static void main( String[] args ){
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("spring.xml"); Customer customer =
		 * (Customer)context.getBean("customer"); ListQuestion lq =
		 * (ListQuestion)context.getBean("listQuestion");
		 * System.out.println("Customer class bean:");
		 * System.out.println(customer.toString());
		 * System.out.println("ListQuestion bean"); System.out.println(lq.toString());
		 * System.out.println("SetQuestion bean"); SetQuestion sq =
		 * (SetQuestion)context.getBean("setQuestion");
		 * System.out.println(sq.toString()); System.out.println("MapQuestion bean");
		 * MapQuestion mq = (MapQuestion)context.getBean("mapQuestion");
		 * System.out.println(mq.toString());
		 */
    	
    }
    public String customerCase() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Customer customer = (Customer)context.getBean("customer");
    	String value = customer.toString();
    	return value;
    }
    public String listQuestion(){
    	ListQuestion lq = (ListQuestion)context.getBean("listQuestion");
    	return lq.toString();
    }
    public String setQuestion() {
    	SetQuestion sq = (SetQuestion)context.getBean("setQuestion");
    	return sq.toString();
    }
    public String mapQuestion() {
    	MapQuestion mq = (MapQuestion)context.getBean("mapQuestion");
    	return mq.toString();
    }
}
