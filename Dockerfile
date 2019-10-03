FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 7000
ADD target/*.jar app.jar
ENTRYPOINT ["sh" , "-c" ,"java -jar /app.jar"]