FROM openjdk:17-jdk-slim
RUN mkdir /app
COPY target/search-engine-0.1.jar /app
EXPOSE 22100
CMD ["java", "-jar", "/app/search-engine-0.1.jar"]

