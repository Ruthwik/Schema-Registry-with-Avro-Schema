package com.student.manager.kafka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.stream.schema.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SchemRegistryConfig {

	private static final Logger LOGGER = LoggerFactory.getLogger(SchemRegistryConfig.class);
	
    @Bean
    public SchemaRegistryClient schemaRegistryClient(@Value("${spring.cloud.stream.kafka.binder.producer-properties.schema.registry.url}") String endPoint) {
    	
    	LOGGER.info("schemaRegistryClient() :: Creating ConfluentSchemaRegistryClient");
        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
        client.setEndpoint(endPoint);
        return client;
    }
}
