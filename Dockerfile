FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/flowershop-0.0.1-SNAPSHOT.jar flowershop.jar
ENTRYPOINT ["java", "-jar", "flowershop.jar"]
