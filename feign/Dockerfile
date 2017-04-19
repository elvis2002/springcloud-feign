FROM java:8-jre
MAINTAINER elviszhang <zhangb2002@163.com>

ADD ./target/feign-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/feign-service.jar"]

EXPOSE 5000