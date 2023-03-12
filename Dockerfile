FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY . /app
RUN mvn package
EXPOSE 22100
CMD ["java", "-jar", "target/search-engine-0.1.jar"]
