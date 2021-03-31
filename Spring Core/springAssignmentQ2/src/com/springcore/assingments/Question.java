package com.springcore.assingments;

//import java.util.List;

public class Question {
	int questionId;
	String question;
	String answers ;
	
	public Question(int questionId, String question, String answers) {
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswers() {
		return answers;
	}
	
	public void printQuestionAndAnswers() {
		System.out.println(getQuestion());
		System.out.println(getAnswers());
	}
	
}

