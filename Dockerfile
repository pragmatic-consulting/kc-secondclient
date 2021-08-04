FROM openjdk:8
EXPOSE 8084
ADD target/kc-second-client.jar kc-second-client.jar
ENTRYPOINT ["java","-jar","/kc-second-client.jar"]