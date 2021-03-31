package com.capgemini.RabbitMQAssignment.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Customer")
public class Customer {
	@Id
	private int id;
	private String name;
	private String email;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
