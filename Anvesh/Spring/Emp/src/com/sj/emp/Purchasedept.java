package com.sj.emp;

public class Purchasedept implements Department{
	

	String dept;

	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void printDeptName() {
		// TODO Auto-generated method stub
		System.out.println("The department is " + dept);
	}
}
