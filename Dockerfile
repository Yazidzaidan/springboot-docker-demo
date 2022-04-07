#base docker image
FROM openjdk:17

LABEL maintainer="yazidproject.com"

ADD target/springboot-docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]


