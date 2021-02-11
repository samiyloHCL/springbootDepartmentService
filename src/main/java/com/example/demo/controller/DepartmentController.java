package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
		
	@RequestMapping("/home")
	public String home() {
			
		return "We hare in Department Home";
	}
	

	@RequestMapping("/info")
	public String error() {
		
		return "You are now on the Department Info";
	}

}
