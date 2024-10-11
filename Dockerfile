# Use the official OpenJDK 21 Debian-based image
FROM openjdk:21-jdk-slim

# Argument for the jar file
ARG JAR_FILE=target/*.jar

# Copy the jar file to the container
COPY ${JAR_FILE} app.jar

# Expose the port (8081 as per your application properties)
EXPOSE 8082

# Command to run the jar file
ENTRYPOINT ["java", "-jar", "/app.jar"]
