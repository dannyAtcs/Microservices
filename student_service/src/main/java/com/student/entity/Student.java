package com.student.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {

	
	private Long student_id;
	
	private String name;
	private int rollno;
	
	List<StudentDetails> list = new ArrayList<>();

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long student_id, String name, int rollno) {
		this.student_id = student_id;
		this.name = name;
		this.rollno = rollno;
	}

	public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public List<StudentDetails> getList() {
		return list;
	}

	public void setList(List<StudentDetails> list) {
		this.list = list;
	}
	
	
}
