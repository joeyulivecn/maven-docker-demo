FROM maven:3.8.2-jdk-8 as build-env
ADD . /java/app
WORKDIR /java/app
RUN mvn clean package spring-boot:repackage -DskipTests
FROM anapsix/alpine-java:8_server-jre
COPY --from=build-env /java/app/target/maven-docker-demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar