package com.studentdetails.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.studentdetails.entity.StudentDetails;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

	List<StudentDetails> list = List.of(
			new StudentDetails(220L, "9832684837", "Rakesh", "Aditi", "Murlipura", 1011L),
			new StudentDetails(230L, "6759879347", "Himanshu", "Ayushi", "Amer", 1012L),
			new StudentDetails(240L, "6458645945", "Manish", "Rekha", "Jaipur", 1013L)
			);

	@Override
	public List<StudentDetails> getDetailsOfStud(Long Student_id) {
		
		return list.stream().filter(student -> student.getStudent_id().equals(Student_id)).collect(Collectors.toList());
	}
	
	

	
}
