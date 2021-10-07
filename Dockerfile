FROM openjdk:14-jdk-alpine3.10
ADD ./target/GestaoAmbiental-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
CMD java -jar app.jar
