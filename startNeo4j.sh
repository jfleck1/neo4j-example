#!/usr/bin/env bash
set -e
set -o pipefail

docker run \
  --rm \
  -p=7474:7474 \
  -p=7687:7687 \
  -e NEO4J_AUTH=neo4j/secret \
  --name neo4j \
  neo4j
