package com.student.manager.service;

import java.util.List;

import com.student.manager.model.Student;


public interface StudentManagerService {

	public String addStudent(Student student);

	public Student getStudentById(String id);

	public List<Student> getStudentList();
}
