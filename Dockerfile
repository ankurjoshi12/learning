FROM maven:3-openjdk-11

WORKDIR /usr/src/learning
COPY pom.xml .
#COPY . .

#RUN mvn clean
CMD ["mvn", "clean"]