FROM openjdk:8
EXPOSE 8080
ADD target/springboot-images.jar springboot-images.jar
ENTRYPOINT ["java","-jar","/springboot-images"]