package com.vunnam.security;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private long id;
	private String username;
	private String password;
	private String role;

	/*
	 * public User() {
	 * 
	 * } public User(long id, String username, String password, String role) {
	 * super(); this.id = id; this.username = username; this.password = password;
	 * this.role = role; }
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
