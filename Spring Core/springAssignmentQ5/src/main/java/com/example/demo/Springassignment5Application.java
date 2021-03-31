package com.example.demo;

import javax.inject.Inject;
import javax.inject.Qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service
public class Springassignment5Application {

	@Inject
	@org.springframework.beans.factory.annotation.Qualifier("vsitedplaces")
	Places visited;
	public void visit()
	{
		visited.visited();
	}

}
