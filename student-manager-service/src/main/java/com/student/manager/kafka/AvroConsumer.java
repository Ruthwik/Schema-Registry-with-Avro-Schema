package com.student.manager.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

import com.student.manager.kafka.schema.avro.StudentAvro;
import com.student.manager.model.Student;
import com.student.manager.service.StudentManagerService;

@Service
public class AvroConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(AvroConsumer.class);

	@Autowired
	private StudentManagerService studentManagerService;

	@StreamListener(Processor.INPUT)
	public void readFromKafka(StudentAvro studentAvro) {

		Student student = new Student(studentAvro.getStudentId().toString(), studentAvro.getFirstName().toString(),
				studentAvro.getLastName().toString(), studentAvro.getDob().toString(),
				studentAvro.getEmail().toString());
		
		studentManagerService.addStudent(student);
		
		LOGGER.info("Let's process Message: {}", student);
	}

}
