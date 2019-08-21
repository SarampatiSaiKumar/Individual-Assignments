package com.sj.beans;

public class Helloconstr {
	String message;

	public Helloconstr(String message) {
		super();
		this.message = message;
	}
	
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("hi from spring constrcutor bean");
	}

}
