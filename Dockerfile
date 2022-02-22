FROM gradle:7.3.3-alpine AS BUILD
COPY . .
RUN gradle quarkusBuild
#RUN ./gradlew build -Dquarkus.package.type=uber-jar

FROM java:11-alpine
COPY --from=BUILD . .
CMD["java", "-jar", "build/quarkus-app/quarkus-run.jar"]
