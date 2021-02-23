package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Quote;
import com.example.demo.service.QuoteService;

@SpringBootTest
class SpringBootDepartmentMicroserviceApplicationTests {
	
	QuoteService quoteService;
	
	@BeforeAll
	public void before() {
		this.quoteService = new QuoteService();
	}

	@Test
	void contextLoads() {
		this.quoteService.addQuote(new Quote("ABC", "D"));
		assertEquals("ABC", this.quoteService.getQuote().getValue());
	}
	
	@Test
	public void testGetQuoteMultiple() {
		this.quoteService.addQuote(new Quote("ABC", "D"));
		this.quoteService.addQuote(new Quote("EFG", "H"));
		assertTrue("ABC".equals(this.quoteService.getQuote().getValue()) || "EFG".equals(this.quoteService.getQuote().getValue()));
	}

}
