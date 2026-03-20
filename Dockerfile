# Etapa 1: Construcción (Maven con Java 17)
FROM maven:3.8.5-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución (Java 17 JRE ligero)
FROM eclipse-temurin:17-jre-alpine
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]