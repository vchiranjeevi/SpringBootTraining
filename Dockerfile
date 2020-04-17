#
# Build Stage
#
FROM maven:slim AS build
MAINTAINER Chiranjeevi <Chiranjeevi.Vadapalli@mindtree.com>
RUN mkdir -p /mindtree/app/src
COPY src /mindtree/app/src
COPY pom.xml /mindtree/app
RUN mvn -f /mindtree/app/pom.xml clean package
#
#
FROM openjdk:8-jdk-alpine 
COPY --from=build /mindtree/app/target/training-201-0.0.1-SNAPSHOT.jar /app/training.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/training.jar"]
