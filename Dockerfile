FROM openjdk:11-jdk AS base

ENV MAVEN_VERSION 3.9.1
ENV MAVEN_HOME /usr/share/maven

RUN wget -q -O - https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz | tar -xzf - -C /usr/share \
    && mv /usr/share/apache-maven-${MAVEN_VERSION} ${MAVEN_HOME} \
    && ln -s ${MAVEN_HOME}/bin/mvn /usr/bin/mvn

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

FROM base AS build

COPY src/ /app/src/
RUN mvn package -DskipTests

FROM openjdk:11-jdk AS final

COPY --from=build /app/target/stock-0.0.1-SNAPSHOT.jar /app/stock.jar

ENTRYPOINT ["java", "-jar", "/app/stock.jar"]
