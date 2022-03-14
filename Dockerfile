FROM maven:3.8.1-adoptopenjdk-11 AS GR_BUILD
#WORKDIR /app
COPY ./ ./
RUN mvn clean package -DskipTests
#RUN ./gradlew build -Dquarkus.package.type=uber-jar

FROM adoptopenjdk:11
COPY --from=GR_BUILD /target ./target
CMD ["java -jar arget/quarkus-app/quarkus-run.jar"]
