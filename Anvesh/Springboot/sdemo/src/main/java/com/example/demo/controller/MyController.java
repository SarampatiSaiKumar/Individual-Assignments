/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

/**
 * @author Anvesh
 *
 */

@RestController
@RequestMapping(value="/web")
public class MyController {
    
	@Autowired
	BookRepo repo;
	
	@GetMapping("/books")
	public List<Book> findAll() {
		return repo.findAll();
		
	}
	@PostMapping("/books")
	@ResponseBody
	public Book createBook(@RequestBody Book book) {
		return repo.save(book);
		
	}
	
	@GetMapping(value="hi")
	public String sayHello() {
		
		return "Hello world";
	}
	@RequestMapping("update")
	
	public String updateEmployee(@RequestBody Book book) {
		int eid=book.getId();
		if(repo.existsById(eid)) {
		repo.save(book);
		
		return "Successfully updated  record";
		}
		return "sorry invalid id";
	}
	
}
