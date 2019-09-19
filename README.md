# Schema-Registry-with-Avro-Schema


Steps

1. Run Kafka
2. Create Topics avro.topic1,avro.topic2
3. Run Schema Registry and landoop docker run --rm -p 8000:8000 -e "SCHEMAREGISTRY_URL=http://localhost:8081" -e "PROXY=true" landoop/schema-registry-ui
4. mvn clean install - will create a docker image in local Registry
5. docker network create local_network
6. docker-compose to run the services
