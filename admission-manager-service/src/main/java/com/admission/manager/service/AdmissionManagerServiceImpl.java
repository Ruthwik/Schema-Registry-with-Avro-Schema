package com.admission.manager.service;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.admission.manager.kafka.AvroProducer;

import com.admission.manager.model.Student;
import com.student.manager.kafka.schema.avro.StudentAvro;

public class AdmissionManagerServiceImpl implements AdmissionManagerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(AdmissionManagerServiceImpl.class);

	@Autowired
	private AvroProducer avroProducer;

	@Override
	public String addStudent(Student student) {
		LOGGER.info("addStudent : Entered");

		String studentId = UUID.randomUUID().toString();
		student.setStudentId(studentId);

		LOGGER.info("Adding a student with student id [{}]", studentId);

		StudentAvro studentAvro = new StudentAvro(studentId, student.getFirstName(), student.getLastName(),
				student.getDob(), student.getDob(), student.getEmail());

		avroProducer.putOnKafka(studentAvro);

		return studentId;

	}

}
