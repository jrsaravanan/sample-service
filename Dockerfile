FROM openjdk:11-jre-slim
VOLUME /tmp
ARG JAR_FILE=/build/libs/*.jar
ADD ${JAR_FILE} app.jar/
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080