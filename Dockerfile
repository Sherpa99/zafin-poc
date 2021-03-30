FROM adoptopenjdk/openjdk8-openj9:alpine-slim

COPY target/primary-core-0.0.1-SNAPSHOT.jar /

RUN mkdir /root/.postgresql/

COPY cert.pem /root/.postgresql/

ENTRYPOINT ["java", "-jar", "primary-core-0.0.1-SNAPSHOT.jar" ]
