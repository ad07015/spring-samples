#FROM openjdk:19-jdk-alpine
#MAINTAINER baeldung.com
#COPY target/f1dbapi-0.0.1-SNAPSHOT.jar f1dbapi-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/f1dbapi-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17.0.1
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]