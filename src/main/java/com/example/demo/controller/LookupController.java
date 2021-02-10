package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Department;
import com.example.demo.service.LookupService;

@Component
public class LookupController {
	
	private static final Logger logger = LoggerFactory.getLogger(LookupController.class);
	
	@Autowired
	private LookupService service;
	
	private static int depoIndex = 0;
	
	private static final List<String> depoList = new ArrayList<>();
	
	//Add list of depos to lookup to list
	static {
		depoList.add("Putorch");
		depoList.add("Tensorflow");
		depoList.add("Scikit-learn");
		depoList.add("spring-boot");
		depoList.add("spring-mvc");
		depoList.add("spring-security");
	}
	
	@Scheduled(fixedRate = 2000)
	public void scheduledTasks() throws Exception {
		CompletableFuture<Department> info = service.findDepartment(depoList.get(depoIndex));
		
		depoIndex = (depoIndex + 1) % depoList.size();
		
		logger.info("--> " + info.get());
	}

}
