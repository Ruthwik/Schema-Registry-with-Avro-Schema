# Schema-Registry-with-Avro-Schema
Design
![alt text](https://github.com/Ruthwik/Schema-Registry-with-Avro-Schema/blob/master/design/school_admission_system.svg)

Pre Requesites
Docker installed
Local Registry up and running on port 5000

Steps
1. mvn clean install - will create a docker image in local Registry (both the services)
2. docker network create local_network
3. docker-compose to run the services
  This will run
   a. zookeeper
   b. kafka
   c. schema registry
   d. landoop: A GUI for schema registry http://localhost:8000/#/
   e. Admission Manager service http://localhost:7070/admission/v1/swagger-ui.html
   f. Student Manager Service http://localhost:9090/student/v1/swagger-ui.html


