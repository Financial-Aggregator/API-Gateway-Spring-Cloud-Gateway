FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 1010
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]