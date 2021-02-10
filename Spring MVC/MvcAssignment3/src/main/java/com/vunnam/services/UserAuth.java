package com.vunnam.services;

public class UserAuth {
	//Take values from a properties files that would be much better to simulate login
	//but I'm taking directly just to go in accordance with question -only doing what asked.
	private String user = "Vunnam";
	private String pass = "Krrish";
	public boolean isValid(String username, String password) {
		if(username.equalsIgnoreCase(user) && password.equals(pass)) {
			return true;
		}
		return false;
	}
}
