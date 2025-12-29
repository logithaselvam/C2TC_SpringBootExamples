package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleCode {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/status")
	public String status() {
		return "Application is running";
	}
	
}
