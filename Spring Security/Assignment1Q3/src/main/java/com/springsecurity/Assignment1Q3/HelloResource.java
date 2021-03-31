package com.springsecurity.Assignment1Q3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@GetMapping("/")
	public String home() {
		return "Hello this is the Homepage..";
	}
	@GetMapping("/user")
	public String user() {
		return "Hello User.";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin.";
	}

}
