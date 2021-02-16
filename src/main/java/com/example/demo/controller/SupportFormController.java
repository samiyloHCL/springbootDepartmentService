package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/support")
	public String submitComplaint(@Valid @ModelAttribute("supportDetails") SupportForm supportDetails, BindingResult bindingResult, Model model) {
		
		List<String> membershipList = Arrays.asList("Platnum", "Gold", "Silver");
		model.addAttribute("membershipList", membershipList);
		
		//Seems like we dont need this because we already added it in the Param section.
		//model.addAttribute("supportDetails", supportDetails);
		
		if (bindingResult.hasErrors()) {
			System.out.println("Errors found!");
			return "support";
		}
		
		System.out.println("No errors found");
		
		return "submit";
	}

}
