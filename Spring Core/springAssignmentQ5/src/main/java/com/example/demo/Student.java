package com.example.demo;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String studentplace;
    private String studentname;
    
    @Required
	public String getStudentplace() {
		return studentplace;
	}
	public void setStudentplace(String studentplace) {
		this.studentplace = studentplace;
	}
	
	@Required
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	@Override
	public String toString()
	{
		return "[" +this.getStudentplace() +this.getStudentname()+"]";
		
	}
    
}
