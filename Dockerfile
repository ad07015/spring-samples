FROM openjdk:19-jdk-alpine
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:17.0.1
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]