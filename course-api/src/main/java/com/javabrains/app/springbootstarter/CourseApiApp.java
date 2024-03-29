package com.javabrains.app.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.javabrains.app.controllers", "com.javabrains.app.data"})
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);

	}

}
