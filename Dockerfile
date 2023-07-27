FROM openjdk:17-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean

# Copy the pom.xml and src files into the container
COPY pom.xml /app/
COPY src /app/src/

# Build the application with Maven
RUN mvn package

# The command to run your Java application (replace 'MainClass' with the main class of your application)
CMD ["java", "-cp", "target/LeetCodeSolutions-1.0-SNAPSHOT.jar", "Main"]