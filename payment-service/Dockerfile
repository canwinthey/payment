FROM openjdk:8-jdk-alpine
EXPOSE 8084
ADD target/payment-service-0.0.1-SNAPSHOT.jar payment-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar payment-service-0.0.1-SNAPSHOT.jar"]