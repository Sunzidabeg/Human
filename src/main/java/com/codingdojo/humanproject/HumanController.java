package com.codingdojo.humanproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HumanController{
	
	@RequestMapping ("/")
	public String inex(@RequestParam(value="name", required=false)String name) {
	if (name == null) {
	return "Hello Human, Welcome to Spring Boot!";
	
	}else {
	return "Hello "+ name+", Welcome to Spring Boot!";
		
	}
	}
	
	
}


	
		
		
		
		
		
	

