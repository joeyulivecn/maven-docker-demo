# maven-docker-demo

Use multi-stage build to build docker image with Maven

https://docs.docker.com/develop/develop-images/multistage-build/

```
$ docker build -t joeyucn/maven-docker-demo:latest -f Dockerfile . 
$ docker run -p 8080 joeyucn/maven-docker-demo:latest
$ curl localhost:8080
```
