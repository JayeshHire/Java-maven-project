FROM maven:3.8-openjdk-17
#FROM openjdk:17

WORKDIR /app

COPY ./pom.xml ./pom.xml

#RUN apt install maven

RUN mvn dependency:go-offline -f /app/pom.xml

COPY ./src/ ./src/

RUN mvn package -f ./pom.xml

EXPOSE 8080 

CMD ["java", "-jar", "./target/your-application.jar"]
