package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DeptDBDao extends JpaRepository<Department, Integer> {

	public List<Department> findByManager(String manager);
}
