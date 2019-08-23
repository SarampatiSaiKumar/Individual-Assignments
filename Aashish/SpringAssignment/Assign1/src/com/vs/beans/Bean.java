package com.vs.beans;

import com.vs.interfaces.Department;

public class Bean {

	Department department;
	
	public void show() {
		department.deptName();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
