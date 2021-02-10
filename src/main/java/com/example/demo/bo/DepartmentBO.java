package com.example.demo.bo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentBO {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.saveDepartment(department);
	}


	public findDepartmentById(Long departmentId) {
		
		return departmentRepository.findDepartmentById(departmentId);
	}


}
