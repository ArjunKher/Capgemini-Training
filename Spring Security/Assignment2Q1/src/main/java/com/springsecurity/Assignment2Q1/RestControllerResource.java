package com.springsecurity.Assignment2Q1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerResource {
	
	@RequestMapping("/")
	public String home() {
		return "Hompage!";
	}
	@RequestMapping("/user")
	public String user() {
		return "Hello User....";
	}
	@RequestMapping("/admin")
	public String admin() {
		return "Hello Admin....";
	}
}
