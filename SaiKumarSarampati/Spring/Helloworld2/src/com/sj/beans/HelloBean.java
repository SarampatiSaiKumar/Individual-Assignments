package com.sj.beans;

public class HelloBean {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void sayHello() {
		System.out.println("Hello" +message);
	}
}
