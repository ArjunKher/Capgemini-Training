package com.springrest.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableJpaRepositories("com.springrest.repo")
//@ComponentScan("com.springrest.*")

//@EntityScan("com.vunnam.model")
//@ComponentScan("com.vunnam.boot.rest")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
