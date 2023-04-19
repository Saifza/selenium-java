FROM openjdk:11
WORKDIR /app

# Copy the JAR file into the container
COPY target/selenium-java-0.0.1-SNAPSHOT.jar /app

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/app/selenium-java-0.0.1-SNAPSHOT.jar"]

