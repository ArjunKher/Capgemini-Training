package com.vunnam.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome to User perspective";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome to admin perspective";
	}
}
