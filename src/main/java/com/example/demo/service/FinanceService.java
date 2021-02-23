package com.example.demo.service;

import java.util.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.example.demo.entity.FinanceKey;

public class FinanceService {
	
	FinanceKey apiKey = new FinanceKey();
		
	
	public HttpResponse<String> getAutoComplete() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://apidojo-yahoo-finance-v1.p.rapidapi.com/auto-complete?q=apple&region=US"))
				.header("x-rapidapi-key", "6940820188msh40f92ab7c895240p158dedjsn045dc77c4eeb")
				.header("x-rapidapi-host", "apidojo-yahoo-finance-v1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		return response;
		
	}
	
}
