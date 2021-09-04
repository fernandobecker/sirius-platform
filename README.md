# Introduction

Create a simple project to test Spring Cloud Gateway with Eureka in Peer.

# Software needed

1. Apache Maven (http://maven.apache.org).

2. Docker (http://docker.com).

# Config Hosts Eureka Clustered

1 - Open /etc/hosts

2 - Add:
  
  - 127.0.0.1 peer1-server.com

  - 127.0.0.1 peer2-server.com

# Building the Docker Images
To build the code as a docker image, open a command-line window change to the directory where you have downloaded the source code.

Run the following maven command.

**mvn clean package docker:build**

# Running the services

* To build the platform :

    ```
   $ docker-compose build
    ```

* To run the platform :

    ```
   $ docker-compose up -d
    ```

* To stop the platform :

    ```
   $ docker-compose down
    ```


# Testing the services
To test the services, run a curl command (or use the browser) and verify the result:

Eureka Server endpoints (instances):

**curl http://localhost:8761/eureka/**

**curl http://localhost:8762/eureka/**

Gateway Server Endpoints:

**curl http://localhost:9500/**
