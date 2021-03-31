package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class Project {
	private String projectName;

	@Autowired
	Environment env;
	public Project() {
		
	}
	public Project(String projectName) {
		this.projectName = projectName;
		
	}
	
	public String getProjectName() {
		return projectName;
	}
	@Value("Capgemini")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return env.getProperty("user.Name")+" Project [projectName=" + projectName+ "]";
	}
	

}