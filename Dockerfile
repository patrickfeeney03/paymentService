FROM openjdk:19-slim

WORKDIR /app

LABEL authors="Patrick"

COPY target/paymentService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "paymentService-0.0.1-SNAPSHOT.jar"]