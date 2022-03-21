FROM openjdk:11
ADD target/twitter.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]