package com.studentdetails.entity;

public class StudentDetails {

	private Long Enrollment_no;
	
	private String mobile_no;
	private String father_name;
	private String mother_name;
	private String address;
	private Long Student_id;
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(Long enrollment_no, String mobile_no, String father_name, String mother_name, String address,
			Long student_id) {
		Enrollment_no = enrollment_no;
		this.mobile_no = mobile_no;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.address = address;
		Student_id = student_id;
	}
	public Long getEnrollment_no() {
		return Enrollment_no;
	}
	public void setEnrollment_no(Long enrollment_no) {
		Enrollment_no = enrollment_no;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(Long student_id) {
		Student_id = student_id;
	}
	
	
	
}