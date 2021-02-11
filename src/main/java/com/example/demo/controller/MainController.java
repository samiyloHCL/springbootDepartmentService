package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/main")
public class MainController {
	
	@RequestMapping("/index")
	public String index() {
		
		return "You are now in Main Index";
	}

}
