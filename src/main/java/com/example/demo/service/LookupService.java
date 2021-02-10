package com.example.demo.service;



import java.util.concurrent.CompletableFuture;

import org.slf4j.*;

import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Department;

@Service
public class LookupService {
	
	private static final Logger logger = LoggerFactory.getLogger(LookupService.class);
	private static final String GITHUB_USERS_URL = "https://api.github.com/users/%s";
	private final RestTemplate restTemplate;
	
	public LookupService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	@Async
	public CompletableFuture<Department> findDepartment(String department) throws InterruptedException {
		logger.info("Looking up " + department);
		
		String url = String.format(GITHUB_USERS_URL, department);
		
		Department result = restTemplate.getForObject(url, Department.class);
		
		Thread.sleep(4000L);
		
		return CompletableFuture.completedFuture(result);
	}
	

}
