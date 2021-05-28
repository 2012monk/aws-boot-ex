FROM adoptopenjdk/openjdk11:alpine-jre

ARG app
ADD $app app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
