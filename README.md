# hanuman : authentication, authorization and central security service
 ## How to build and run using maven in mac terminal?

### Build the Application Using Maven: 
Compile the application and package it into a JAR file using the Maven wrapper. This step will create the executable JAR file in the target directory.

`./mvnw package`

### Run the Application Locally: 
Execute the JAR file to start the Spring Boot application. It will listen on the port specified in your application.properties (8081 in this case).

`java -jar target/hanuman-0.0.1-SNAPSHOT.jar`

## Containerize and Run the Application in docker
### Build the Docker Image: 
Use the Docker CLI to build an image from your Dockerfile. The -t flag tags the image with the name hanuman.

`docker build -t hanuman .`

### Run the Docker Container
Start a container from the hanuman image. The -p flag maps port 8081 of the container to port 8081 on your host machine, allowing you to access the application

`docker run -p 8082:8082 hanuman`

## Access the Application 
Once the application is running, you can access it in your web browser or API testing tool by navigating to: 
http://localhost:8082/

### Validate the correctness
This should return **Jai Shree Ram, Jai Hanuman Ji Maharaj with current date and time**, confirming that the application is running correctly.
