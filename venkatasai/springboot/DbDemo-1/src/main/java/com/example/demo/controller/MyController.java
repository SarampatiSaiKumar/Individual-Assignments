package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

@RestController
@RequestMapping(value = "/web")
public class MyController {

	@Autowired
	BookRepo bookRepo;
	@GetMapping("/books")
	public List<Book> findbooks()
	{
		return bookRepo.findAll();
	}
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book ) {
		
		return bookRepo.save(book);
	}
	@GetMapping("/isbook/")
	public boolean existsById(@RequestParam int id) {
		
		return bookRepo.findById(id)!= null;
		
	}
	
	@GetMapping("/book")
	
	public Optional<Book> findById(@RequestParam int id) {
		
		return bookRepo.findById(id);
		   
	}
	
	@DeleteMapping("/book/{id}")
	public void deleteById(@PathVariable Integer id) {
		System.out.println("deleting the record");
		bookRepo.deleteById(id);
	}
	
}