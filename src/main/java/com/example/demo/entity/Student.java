package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	private int stid;
	private String stname;
	private int strollno;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="stid",referencedColumnName = "stid")
	private List<Book> book;
	public Student() {
		super();
	}
	public Student(int stid, String stname, int strollno, List<Book> book) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.strollno = strollno;
		this.book = book;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getStrollno() {
		return strollno;
	}
	public void setStrollno(int strollno) {
		this.strollno = strollno;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
	

}
