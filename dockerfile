FROM openjdk:8
ADD target/RideRateCardService-0.0.1-SNAPSHOT.jar RideRateCardService.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","RideRateCardService.jar"]