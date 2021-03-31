package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
		QuestionList answerList = (QuestionList) context.getBean("questionList");
		answerList.printQuestionAndAnswers();
				
		QuestionMap questionMap = (QuestionMap) context.getBean("questionMap");
		questionMap.printQuestionAndAnswers();
							
				

	}

}
