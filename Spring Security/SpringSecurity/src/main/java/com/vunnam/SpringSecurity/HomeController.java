package com.vunnam.SpringSecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping({"/","/home"})
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "User perspetive";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "Admin Perspective";
	}
}
