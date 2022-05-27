package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.entity.Student;
import com.student.service.StudentService1;


@RestController
@RequestMapping("/stud")
public class StudentController {

	@Autowired(required=true)
	private StudentService1 studentService;
	
	@Autowired(required=true)
	private RestTemplate restTemplate;
	

	
	@GetMapping("/{student_id}")
	public Student getStudent(@PathVariable Long student_id)
	{
		
		Student student = this.studentService.getStudent(student_id);
		
		List details = this.restTemplate.getForObject("http://studentdetails-service/details/stud" + student.getStudent_id(),List.class);
		
		student.setList(details);
		return student;
		
	}
	
	
}

