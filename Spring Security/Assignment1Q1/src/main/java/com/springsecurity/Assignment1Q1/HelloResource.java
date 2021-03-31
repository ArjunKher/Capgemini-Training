package com.springsecurity.Assignment1Q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Hello Admin..";
	}
}
