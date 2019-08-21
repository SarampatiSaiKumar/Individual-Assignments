package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.*;

public interface EmpDBDao extends JpaRepository<Employee, Integer>{

	public List<Employee> findByDesignation(String designation);
	@Query("from Employee where designation=?1 order by age")
	public List<Employee> getEmpsInSortedByAge(String designation);
	
}
