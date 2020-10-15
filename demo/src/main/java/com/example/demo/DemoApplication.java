package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("First Spring Boot Project");
		System.out.println("Tested from ubntu 20.04 on oct-16-20");
		SpringApplication.run(DemoApplication.class, args);
	}

}
