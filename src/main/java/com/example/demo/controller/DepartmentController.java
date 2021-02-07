package com.example.demo.controller;
import java.lang.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.DepartmentBO;
import com.example.demo.entity.Department;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentBO departmentBO;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
			
			return departmentBO.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@RequestBody Long departmentId ) {
		return departmentBO.findDepartmentById(departmentId);
	}
}
