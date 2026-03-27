FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/*.jar cse.jar

CMD ["java","-jar","cse.jar"]

