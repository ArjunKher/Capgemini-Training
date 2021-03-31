package com.example.demo;

import javax.annotation.Resource;

public class VisitedPlaces {
 
	private int placeId;
	private String place;
	
	@Resource(name="Student")
	private Student student;

	
	
	
	public int getPlaceId() {
		return placeId;
	}




	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}




	public String getPlace() {
		return place;
	}




	public void setPlace(String place) {
		this.place = place;
	}




	public Student getStudent() {
		return student;
	}




	public void setStudent(Student student) {
		this.student = student;
	}




	public void toStrings()
	{
		System.out.println("Student ["+student.toString()+", placeId"+this.placeId+", place"+this.place);
	}
}
