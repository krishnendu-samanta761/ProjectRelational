package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.entity.Student;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.MainRepository;

  @Service
  public class MainService {
  
	  @Autowired private MainRepository mainrepo;
      public String add(Student student) {
	  mainrepo.save(student);
	  return"data added in Student Table";
	}
      @Autowired private BookRepository bookrepo;
      public String add1(Book book) {
    	  bookrepo.save(book);
    	  return "data added in book table";
      }

}
