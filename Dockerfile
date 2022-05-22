FROM openjdk:11
EXPOSE 8080
COPY build/libs/web-service-test-0.0.1-SNAPSHOT.jar web-service-docker.jar
CMD ["java", "-jar", "/web-service-docker.jar"]