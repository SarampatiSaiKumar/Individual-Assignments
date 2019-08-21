package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car implements Serializable {
	
	@Id
	@GeneratedValue
	int id;
	String model;
	int yearsused;
	String color;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearsOfUse() {
		return yearsused;
	}
	public void setYearsOfUse(int yearsOfUse) {
		this.yearsused = yearsOfUse;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", yearsused=" + yearsused + ", color=" + color + ", price="
				+ price + "]";
	}
	

}
