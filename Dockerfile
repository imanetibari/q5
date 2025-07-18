FROM openjdk:26-slim-bullseye
COPY target/pipline.jar pipline.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/pipline.jar"]
