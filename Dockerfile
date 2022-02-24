FROM gradle:7.3.3-jdk11-alpine AS GR_BUILD
WORKDIR /app
COPY ./ ./
RUN gradle quarkusBuild
#RUN ./gradlew build -Dquarkus.package.type=uber-jar

FROM adoptopenjdk:11
COPY --from=GR_BUILD /app/build ./build
CMD ["java -jar build/quarkus-app/quarkus-run.jar"]
