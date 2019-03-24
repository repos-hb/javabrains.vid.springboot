package com.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.javabrains.topic"})
public class CourseApiSpringdataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiSpringdataJpaApplication.class, args);
	}

}
