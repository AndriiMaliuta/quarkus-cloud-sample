FROM gradle:7.3.3-alpine AS BUILD
WORKDIR /app
COPY ./ ./
RUN gradle quarkusBuild
#RUN ./gradlew build -Dquarkus.package.type=uber-jar

FROM java:11-alpine
COPY --from=BUILD /home/gradle/build ./build
CMD ["/bin/sh", "-c", "-java -jar ./build/quarkus-app/quarkus*.jar"]
