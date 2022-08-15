FROM openjdk:19-jdk-alpine
WORKDIR /app
COPY build/libs/kotlin-coroutine-0.0.1.jar /app/app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-jar","/app/app.jar"]
