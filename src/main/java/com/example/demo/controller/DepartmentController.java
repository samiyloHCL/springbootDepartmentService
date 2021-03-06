package com.example.demo.controller;

import java.io.IOException;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Quote;
import com.example.demo.service.FinanceService;
import com.example.demo.service.QuoteService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	private QuoteService quoteService;
	
	public DepartmentController(QuoteService quote) {
		this.quoteService = quote;
	}
	
	@RequestMapping("/quote")
	public Quote getQuote() {
		
		return this.quoteService.getQuote();
	}
	
	@RequestMapping(value="/quote", method=RequestMethod.POST)
	public void addQuote(@RequestBody Quote quote) {
		
		this.quoteService.addQuote(quote);
	}
		
	@RequestMapping("/home")
	public String home() {
			
		return "We hare in Department Home";
	}
	

	@RequestMapping("/info")
	public String error() {
		
		return "You are now on the Department Info";
	}
	
	//YahooFinance API
	@RequestMapping("/finance")
	public String finance() throws Exception, InterruptedException {
		
		FinanceService service = new FinanceService();
			HttpResponse<String> response = service.getAutoComplete();
			
			System.out.println(response.body());
			String output = response.body();
			return output;
	
	}

}
