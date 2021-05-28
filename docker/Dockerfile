FROM adoptopenjdk/openjdk11:alpine-jre

ARG app
ADD $app app.jar

RUN ln -sf /usr/share/zoneinfo/Asiz/Seoul /etc/localtime

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
