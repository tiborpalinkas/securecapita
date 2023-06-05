FROM openjdk:17
COPY . .
CMD mvn spring-boot:run