package com.sj.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lifecycle implements InitializingBean, DisposableBean{

	int counter;

	public Lifecycle() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Bean generated"+ counter);
	}

	public void setCounter(int counter) {
	this.counter=counter;
	this.counter++;
	System.out.println("properties set"+this.counter);
	}

	@Override
	public void destroy() throws Exception {
	// TODO Auto-generated method stub
	counter++;
	System.out.println("Destron interface method"+ counter);

	}

	@Override
	public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	counter++;
	System.out.println("Bean initializing interface method"+counter);
	}

	public void customDestroy() {
	counter++;
	System.out.println("custom destroy method"+counter);
	}
	public void init() {
	counter++;
	System.out.println("custom init method"+counter);
	}
}
