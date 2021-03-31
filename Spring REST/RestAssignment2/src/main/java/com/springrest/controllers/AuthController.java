package com.springrest.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.models.UserModel;

@RestController
public class AuthController {
	@RequestMapping("/auth.html")
	public String userAuth(@ModelAttribute("userModel1") UserModel userModel1) {
		//callAuthenticator
		boolean isValid = fakeCheck(userModel1.getUsername(),userModel1.getPassword());
		if(isValid) {
			return "valid user";
		}
		return "Invalid user";
		
	}
	
	public boolean fakeCheck(String username, String pass) {
		if(username.contentEquals("Simran") && pass.equals("123")) {
			return true;
		}
		return false;
	}
}

