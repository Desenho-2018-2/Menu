#!/bin/bash

##MAIN
cd menu-microservice-category
mvn clean install

if [ $? -eq 0 ]; then
    docker image build -t="category" .
else
    exit 1
fi

cd ../
cd menu-microservice-product-type
mvn clean install

if [ $? -eq 0 ]; then
    docker image build -t="product-type" .
else
    exit 1
fi

cd ../
docker-compose up