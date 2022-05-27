package com.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.studentdetails.entity.StudentDetails;
import com.studentdetails.service.StudentDetailsService;

@RequestMapping("/details")
@RestController
public class StudentDetailsController {

	@Autowired
	private StudentDetailsService studentDetailsService;
	

	
	@GetMapping("/student/{student_id}")
	public List<StudentDetails> getDetails(@PathVariable("student_id") Long student_id)
	{
		return this.studentDetailsService.getDetailsOfStud(student_id);
		
	}
	
}
