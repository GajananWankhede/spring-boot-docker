FROM openjdk:8
EXPOSE 9023
ADD target/spring-boot-docker.war spring-boot-docker.war
ENTRYPOINT ["java","-jar","/spring-boot-docker.war"]