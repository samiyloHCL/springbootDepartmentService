package com.example.demo.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentBO {
	
	@Autowired
	private DepartmentRepository departmentRepo;

}
