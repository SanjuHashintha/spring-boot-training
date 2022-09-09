FROM openjdk:18

RUN mkdir /app

COPY src/main/java/ /app

WORKDIR /app

CMD java Application