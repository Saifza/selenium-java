FROM openjdk:11

WORKDIR /app

# Copy the source code into the container
COPY . /app

# Install Maven and run the build
RUN apt-get update && \
    apt-get install -y maven && \
    mvn clean package

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/app/target/selenium-java-0.0.1-SNAPSHOT.jar"]
