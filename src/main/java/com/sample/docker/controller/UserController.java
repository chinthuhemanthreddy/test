package com.sample.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class UserController {

	@GetMapping
	public String sayHello() {
		
		return "Hello!!";
	}
}
