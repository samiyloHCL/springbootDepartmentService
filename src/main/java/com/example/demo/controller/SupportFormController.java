package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.SupportForm;

@Controller
public class SupportFormController {
	
	@GetMapping("/support")
	public String complaintForm(Model model) {
		
		//Send a supportDetails param with a new support form
		model.addAttribute("supportDetails", new SupportForm());
		
		List<String> membershipList = Arrays.asList("Platinum", "Gold", "Silver");
		model.addAttribute("membershipList",membershipList);
		
		return "support";
		
	}

}
