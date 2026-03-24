package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/cse/home")
	public String Rocks() {
		return "Welcome to Cse";
	}
}
