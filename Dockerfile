FROM amazoncorretto:21

COPY ./target/uberjar/lu.jar /lu/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/lu/app.jar"]
