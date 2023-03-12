FROM eclipse-temurin:11
RUN mkdir /app
COPY target/logisticservice-1.0.jar /app
CMD ["java", "-jar", "/app/logisticservice-1.0.jar","--spring.profiles.active=production"]