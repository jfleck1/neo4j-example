# A Neo4j Example Project

*By Justin Fleck*

This project was created to demonstrate how to use the Neo4j database within a Java and Spring enabled RESTful web
service.

## Building

To build this project from source, simply run the gradle wrapper command;

```
./gradlew clean build docker
```

## Running

### Docker Compose
Use Docker Compose to start both this container and the Neo4j database container. A `docker-compose.yml` file is located
in this directory which includes all the necessary configurations and will use the `./conf` and `./data` for
configuration and persisting the data.

Start it by using;

```
docker-compose up -d
```

Stop it by using;

```
docker-compose down -v
```

Note: You can start with a blank neo4j database by simply removing the `./data` directory and restarting the
composition.

### Docker
You may want to start each container separately. If so, you can use docker to start a Neo4j service with;
```
docker run -d \
  --publish=7474:7474 --publish=7687:7687 \
  --volume=$HOME/neo4j/data:/data \
  --name neo4j \
  neo4j
```

Then you can run this project's container with;
```
./gradlew dockerRun
```

