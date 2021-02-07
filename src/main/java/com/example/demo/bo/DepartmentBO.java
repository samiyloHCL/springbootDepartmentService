package com.example.demo.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentBO {
	
	@Autowired
	private DepartmentRepository departmentRepo;

	public Department save(Department department) {
		// TODO Auto-generated method stub
		return null;
	}


	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
