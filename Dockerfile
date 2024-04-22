FROM openjdk:17
WORKDIR /Users/src/demoDocker

COPY . /Users/src/demoDocker
EXPOSE 8080
CMD [ "java","-jar","demo-0.0.1-SNAPSHOT.jar"]
