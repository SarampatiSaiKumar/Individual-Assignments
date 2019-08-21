package com.sj.emp;

public class Emp {
	String name;
	int id;
	Department d;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	
	public void printDept() {
		d.printDeptName();
	}

}
