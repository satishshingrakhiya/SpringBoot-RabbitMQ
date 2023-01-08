# SpringBoot-RabbitMQ
This Project Depicts two Spring Boot Microservice sending data through RabbitMQ.

### Prerequisite
1. Java
2. Rabbit MQ installed (Erlang required for Rabbit MQ to work)
3. Postman for testing 

### How to install and run Project
1. Clone repository to local.
2. Start Rabbit MQ
3. Start ProducerApplication
4. Open postman and set method as POST and url as http://localhost:9091/api/v1/user and set payload in body as

{

  "firstName":"Satish",

  "lastName":"Shing",

  "email":"satish@example.com",

  "city":"Bengaluru"

}

ans hit send, Successfully sent message will be received.

5. Open Rabbit MQ UI http://localhost:15672 a queue will be visible and a message will be in queue.
6. Now start ConsumerApplication 
7. In the logs we can see the object sent over Rabbit MQ is received and is visible in log. Verify it in Rabbit MQ UI.
