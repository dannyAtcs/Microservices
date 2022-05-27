package com.studentdetails.service;

import java.util.List;

import com.studentdetails.entity.StudentDetails;

public interface StudentDetailsService {
	
	public List<StudentDetails> getDetailsOfStud(Long student_id);

}
