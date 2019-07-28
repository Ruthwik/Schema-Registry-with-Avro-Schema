package com.student.manager.kafka.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.schema.client.ConfluentSchemaRegistryClient;
import org.springframework.cloud.stream.schema.client.SchemaRegistryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchemRegistryConfig {

    @Bean
    public SchemaRegistryClient schemaRegistryClient(@Value("${spring.cloud.stream.kafka.binder.producer-properties.schema.registry.url}") String endPoint) {
        ConfluentSchemaRegistryClient client = new ConfluentSchemaRegistryClient();
        System.out.println("schemaRegistryClient");
        client.setEndpoint(endPoint);
        return client;
    }
}
