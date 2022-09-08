package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repository.MainRepository;
import com.example.demo.service.MainService;

@RestController
public class Maincontroller {

	@Autowired private MainService service;
	
	@Autowired private MainRepository mainRepo;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		return service.add(student);
	}
	
	@PostMapping("/add1")
	public String add1(@RequestBody Book book) {
		return service.add1(book);
	}
	
	
	@GetMapping("/view/{id}")
	public Student view(@PathVariable int id) {
		try {
			return mainRepo.findById(id).get();
		}
		catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
}
