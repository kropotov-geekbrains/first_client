FROM openjdk:11.0.10-jdk
WORKDIR /tmp
ARG JAR_FILE
ARG CONFIG_SERVER_URI
ENV CONFIG_SERVER_URL ${CONFIG_SERVER_URI}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]