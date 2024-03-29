package com.admission.manager.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

import com.student.manager.kafka.schema.avro.StudentAvro;

@Service
public class AvroConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(AvroConsumer.class);

	@StreamListener(Processor.INPUT)
	public void readFromKafka(StudentAvro student) {
		LOGGER.info("Student Added : {}", student);
	}

}
