FROM openjdk:8-jdk

COPY build/libs/ /var/spring-sample/
VOLUME /var/spring-sample/log
CMD [ "/var/spring-sample/spring-sample.jar" ]
