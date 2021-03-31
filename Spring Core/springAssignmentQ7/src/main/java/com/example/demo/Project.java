package com.example.demo;

public class Project {
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	
	
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}
	public int getSubject4() {
		return subject4;
	}
	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}
	public int getSubject5() {
		return subject5;
	}
	public void setSubject5(int subject5) {
		this.subject5 = subject5;
	}
	
	
	public String toString()
	{
		return (this.getSubject1()+"\n"+this.getSubject2()+"\n"+this.getSubject3()+"\n"+this.getSubject4()+"\n"+this.getSubject5());
	}

}
