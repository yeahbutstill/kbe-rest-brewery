# SFG Beer Works - RESTful Brewery Service

This project is to support learning about Restful APIs. 

You can access the API documentation [here](https://sfg-beer-works.github.io/brewery-api/#tag/Beer-Service) 

## Connect with Spring Framework Guru
* Spring Framework Guru [Blog](https://springframework.guru/)
* Subscribe to Spring Framework Guru on [YouTube](https://www.youtube.com/channel/UCrXb8NaMPQCQkT8yMP_hSkw)
* Like Spring Framework Guru on [Facebook](https://www.facebook.com/springframeworkguru/)
* Follow Spring Framework Guru on [Twitter](https://twitter.com/spring_guru)
* Connect with John Thompson on [LinkedIn](http://www.linkedin.com/in/springguru)


## Docker Build
```shell
docker build -f ./src/main/dockerbase/Dockerfile -t kbe-rest .
```

## From Layers
```shell
docker build -f ./src/main/docker/Dockerfile -t kbe-rest .
```

## Build and Push to Docker Hub
```shell
$ docker login --username=maryatdocker
Password:

Login Succeeded
```
```shell
mvn clean package -DskipTests docker:build docker:push 
```
![dockerhub](Screenshot%20from%202023-04-01%2020-51-01.png)

## Docker Run
```shell
docker run -p 8080:8080 kbe-rest
```