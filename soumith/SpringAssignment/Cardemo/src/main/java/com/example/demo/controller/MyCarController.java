package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Car;
import com.example.demo.repo.CarRepo;

@RestController
@RequestMapping(value="/hello")
public class MyCarController {
	
	@Autowired
	CarRepo repo;
	
	@GetMapping(value="/cars")
	public List<Car> findAll(){
		return repo.findAll();
	}
	@PostMapping("/cars")
	public Car createCar(@RequestBody Car car) {
		return repo.save(car);
	}
	
	@GetMapping(value="/deletecars/{id}")
	public List<Car> deleteCar(@PathVariable Integer id){
		System.out.println("Delete id" +id);
		repo.deleteById(id);
		return repo.findAll();
	}
	
	@GetMapping(value="/viewcar/{id}")
	public Optional<Car> editCar(@PathVariable Integer id){
		return repo.findById(id);
	}

	@PostMapping(value="/updatecar/{id}")
	public Car updateCar(@PathVariable Integer id, @RequestBody Car car) {
		
		if(repo.existsById(id)) {
			return repo.save(car);
		}
		return car;
	}
}
