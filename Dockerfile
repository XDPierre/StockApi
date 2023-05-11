FROM maven:3.6.3-jdk-11 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /app/src/
RUN mvn package -DskipTests

FROM openjdk:11-jdk

COPY --from=build /app/target/stock-0.0.1-SNAPSHOT.jar /app/stock.jar

ENTRYPOINT ["java", "-jar", "/app/stock.jar"]
