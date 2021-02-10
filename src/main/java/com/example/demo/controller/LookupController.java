package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.LookupService;

@Component
public class LookupController {
	
	private static final Logger logger = LoggerFactory.getLogger(LookupController.class);
	
	@Autowired
	private LookupService service;
	
	private static int depoIndex = 0;
	
	private static final List<String> depoList = new ArrayList<>();

}
