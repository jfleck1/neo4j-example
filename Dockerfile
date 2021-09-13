FROM openjdk:11-jdk-slim
ARG NAME
ARG VERSION
LABEL name="${NAME}"
LABEL version="${VERSION}"
COPY ${NAME}-${VERSION}.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
