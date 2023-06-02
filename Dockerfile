FROM adoptopenjdk/openjdk11
RUN mkdir -p /opt/app
COPY ./target/employee-management-0.0.1-SNAPSHOT.jar /opt/app/springboot_api.jar
EXPOSE 8080
WORKDIR /opt/app/
CMD java -jar springboot_api.jar