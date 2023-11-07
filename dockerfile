FROM openjdk:21
ADD PruebaCredibanco.class PruebaCredibanco.class
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "PruebaCredibanco"]