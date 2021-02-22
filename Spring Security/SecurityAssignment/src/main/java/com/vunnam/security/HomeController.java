package com.vunnam.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "Welome Home";
	}
	@GetMapping("/user")
	public String user() {
		return "Welcome user";
	}
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin";
	}
}
