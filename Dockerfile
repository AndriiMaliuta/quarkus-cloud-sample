FROM maven:3.8.1-adoptopenjdk-11
#WORKDIR /app
COPY ./ ./
RUN mvn clean package -DskipTests
#RUN ./gradlew build -Dquarkus.package.type=uber-jar

FROM adoptopenjdk:11
COPY --from=GR_BUILD /build ./build
CMD ["java -jar build/quarkus-app/quarkus-run.jar"]
