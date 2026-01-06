package com.example.Greatapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatController {
	@Autowired
	private Environment env;
	@GetMapping("/springboot")
	public String message() {
		
		return "java is every eassy when you practice step by step "+env.getProperty("local.server.port");
	}

}
