package com.springcore.collections;

import java.util.List;

public class QuestionList {
	int questionId;
	String question;
	List<String> answers ;
	
	
	public QuestionList() {
		super();
		
	}
	
	public QuestionList(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public List<String> getAnswers() {
		return answers;
	}
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public void printQuestionAndAnswers() {
		System.out.println(getQuestionId());
		System.out.println(getQuestion());
		System.out.println(getAnswers());
		
	}
	
	
}
