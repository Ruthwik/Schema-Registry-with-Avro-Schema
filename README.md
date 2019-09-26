# Schema-Registry-with-Avro-Schema
## Sequence Diagram
![](https://github.com/Ruthwik/Schema-Registry-with-Avro-Schema/blob/master/design/school_admission_system.svg)

## Pre Requesites
1. Docker installed
2. Local Registry up and running on port 5000

## Steps
1. Run and build both the services. The following will create a docker image in local Registry
  > mvn clean install 
2. Create a Docker network
> docker network create local_network
3. docker-compose to run the services.
   This will run
   * zookeeper
   * kafka
   * schema registry
   * landoop: A GUI for schema registry http://localhost:8000/#/
   * Admission Manager service http://localhost:7070/admission/v1/swagger-ui.html
   * Student Manager Service http://localhost:9090/student/v1/swagger-ui.html
