package com.student.manager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.student.manager.kafka.AvroProducer;
import com.student.manager.kafka.schema.avro.StudentAvro;
import com.student.manager.model.Student;

public class StudentManagerServiceImpl implements StudentManagerService{

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentManagerServiceImpl.class);

	
    @Autowired
    private AvroProducer avroProducer;
    
	private final ConcurrentMap<String, Student> studentMap = new ConcurrentHashMap<>();

	@Override
	public String addStudent(Student student) {
		LOGGER.info("addStudent : Entered");
		
		String studentId = student.getStudentId();
		studentMap.putIfAbsent(studentId,student);
		
		LOGGER.info("Adding a student with student id [{}]",studentId);
		
		StudentAvro studentAvro = new StudentAvro(studentId,student.getFirstName(),student.getLastName(),student.getDob(),student.getDob(),student.getEmail());
		
		avroProducer.putOnKafka(studentAvro);
		
		return studentId;

	}

	@Override
	public Student getStudentById(String id) {
		
		Student student = studentMap.get(id);
		if(null==student) {
			LOGGER.error("Student with id [{}] doesn't exist",id);
		}
		return student;
	}

	@Override
	public List<Student> getStudentList() {
		return new ArrayList<>(studentMap.values());
	}

}
