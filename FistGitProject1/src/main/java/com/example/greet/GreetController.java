package com.example.greet;

import org.springframework.web.bind.annotation.GetMapping;

public class GreetController {
	
	@GetMapping
	public String Greet() {
		return "greet";
	}

}
