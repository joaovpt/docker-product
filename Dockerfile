FROM eclipse-temurin:21-jdk-jammy
COPY target/product-1.0.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

