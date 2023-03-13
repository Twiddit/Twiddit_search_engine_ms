FROM openjdk:17-jdk-slim
RUN mkdir /app
COPY src/main/resources/search-engine.jar /app
EXPOSE 22100
CMD ["java", "-jar", "/app/search-engine.jar"]

