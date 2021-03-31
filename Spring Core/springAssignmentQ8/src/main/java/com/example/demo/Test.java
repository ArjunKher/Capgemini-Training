package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test {

	private String studentname;
	private int age;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
    public String  toString() {
        return "Testing{" +"name='" + studentname + '\'' +", age=" + age +'}';
    }
	@PostConstruct
    public void init() {
        System.out.println("init called");
        System.out.println("---------------------------------");
    }
	

   @PreDestroy
    public void destroy() {
        System.out.println("bean is getting destroyed");
    }
}
