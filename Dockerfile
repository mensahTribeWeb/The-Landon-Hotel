
#LABEL authors="Nick Mensah"

# Use a base image with Node.js
FROM node:latest AS frontend-builder

# Set the working directory inside the Docker image
WORKDIR /usr/src/app/src/main/UI

# Continue with the rest of the Dockerfile
COPY src/main/UI/package*.json ./
RUN npm install
COPY . .
EXPOSE 4200

CMD ["npm", "start"]

# Build Stage for Backend
# Use the official Maven image as a base image
FROM openjdk

# Copy the built JAR from the builder stage to the final image
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar /app/app.jar

# Set the working directory inside the Docker image
WORKDIR /app

# Make the app accessible on port:8080 for the host machine
EXPOSE 8080

# Set the default command to run the application
ENTRYPOINT  ["java", "-jar", "app.jar"]