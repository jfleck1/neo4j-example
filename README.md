# A Neo4j Example Project
*By Justin Fleck*

This project was created to demonstrate how to use the Neo4j database within a Java and Spring enabled RESTful web service.

## Building

To build this project from source, simply run the gradle wrapper command;
```
./gradlew clean build docker
```

## Running
Start a Neo4j service with docker
```
docker run -d \
  --publish=7474:7474 --publish=7687:7687 \
  --volume=$HOME/neo4j/data:/data \
  --name neo4j \
  neo4j
```

Once built, you can run this project with
```
./gradlew dockerRun
```

