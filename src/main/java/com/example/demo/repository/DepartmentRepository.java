package com.example.demo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	@Autowired
	Optional<Department> findDepartmentById(Long departmentId);

	Department saveDepartment(Department department);

}
