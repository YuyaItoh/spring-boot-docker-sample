FROM openjdk:8-jdk

COPY build/libs/ /var/app/
VOLUME /var/app/log
CMD [ "/var/app/app.jar" ]
