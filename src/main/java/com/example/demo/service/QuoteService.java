package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.example.demo.entity.Quote;

public class QuoteService {
	
	private List<Quote> quotes = new ArrayList<>();
	
	public QuoteService() {
		//Initialize first quotes
		this.quotes.add(new Quote("Engineers like to solve problems. If there are no problems handily available, they will create their own problems.", "Scott Adams"));
		this.quotes.add(new Quote("Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.", "Antoine de Saint-Exupery"));
		this.quotes.add(new Quote("The problem in this business isn’t to keep people from stealing your ideas; it's making them steal your ideas!", "Howard Aiken"));
		this.quotes.add(new Quote("Any idiot can build a bridge that stands, but it takes an engineer to build a bridge that barely stands.", "Unknown"));
		this.quotes.add(new Quote("The human foot is a masterpiece of engineering and a work of art.", "Leonardo da Vinci"));
		this.quotes.add(new Quote("The fewer moving parts, the better. Exactly. No truer words were ever spoken in the context of engineering.", "Christian Cantrell"));
		this.quotes.add(new Quote("When you want to know how things really work, study them when they’re coming apart.", "William Gibson"));
		this.quotes.add(new Quote("I’ve never seen a job being done by a five-hundred-person engineering team that couldn’t be done better by fifty people.", "C. Gordon Bell"));
	}
	
	//Grab a random number and grab that index from list of quotes
	public Quote getQuote() {
		Random rn = new Random();
		int select = rn.nextInt(this.quotes.size());
		return this.quotes.get(select);
	}
	
	//Add quote service
	public void addQuote(Quote quote) {
		this.quotes.add(quote);
	}

}
