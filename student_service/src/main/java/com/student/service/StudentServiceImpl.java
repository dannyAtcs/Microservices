package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entity.Student;

@Service
public class StudentServiceImpl implements StudentService1 {

	List<Student> list = List.of(
			new Student(1011L, "Danny Gupta", 21),
			new Student(1012L, "Avinash Soni", 23),
			new Student(1013L, "Chirag Asawa", 25)
			);
	
	@Override
	public Student getStudent(Long student_id) {
		// TODO Auto-generated method stub
//		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
		return list.stream().filter(stud -> stud.getStudent_id().equals(student_id)).findAny().orElse(null);
	}

	
}
