package com.epita.tpaliment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlimentController { 
	
//	@Autowired
//	AlimentService service;

	@GetMapping("/hello")
	public String getHello() {
		return "Hello world"; 
				
	}
}
