package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
		
	@RequestMapping("/")
	public String home() {
			
		return "We hare in Homne";
	}
	

	@RequestMapping("/department")
	public String error() {
		
		return "You are now on the department page";
	}

}
