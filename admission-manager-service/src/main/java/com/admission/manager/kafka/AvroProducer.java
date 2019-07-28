package com.admission.manager.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.student.manager.kafka.schema.avro.StudentAvro;

@Service
public class AvroProducer {

	@Autowired
	private Processor processor;

	public void putOnKafka(StudentAvro student) {

		org.springframework.messaging.Message<StudentAvro> avroMessage = MessageBuilder.withPayload(student)
				.setHeader(KafkaHeaders.MESSAGE_KEY, student.getStudentId()).build();

		processor.output().send(avroMessage);
	}

}
