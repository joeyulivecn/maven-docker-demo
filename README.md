# maven-docker-demo

Use multi-stage build to build docker image with Maven

https://docs.docker.com/develop/develop-images/multistage-build/

```
$ docker build -t joeyucn/maven-docker-demo:latest -f Dockerfile . 
$ docker run -p 8080:8080 joeyucn/maven-docker-demo:latest 
```

### Profiles
```cassandraql
$ docker run -p 8080:8080 -e JAVA_OPTS="-Dspring.profiles.active=prod" joeyucn/maven-docker-demo:latest 
```
```
$ mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

``` 
$ mvn package spring-boot:repackage
$ java -jar -Dspring.profiles.active=prod target/maven-docker-demo-0.0.1-SNAPSHOT.jar
```



