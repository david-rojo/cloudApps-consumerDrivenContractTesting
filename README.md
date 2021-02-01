# Consumer Driven Contract Testing (CDCT)

This repository provides a generation of test using contract testing for two [SpringBoot](https://spring.io/projects/spring-boot) applications:

* **toposervice**: provide a REST API, it acts as server.
* **planner**: consume the REST API exposed by toposervice, it acts as client.

The test cover the following [scenario](doc/scenario.md).

## Steps to run

### Prerequisite

Have installed [Maven](https://maven.apache.org/) 3.6.x

### toposervice (server)

```
$ cd toposervice
$ mvn clean install
```

* Generate and run successfully aceptance test.
* Generate the stub.
* Install the stub in local maven repository.

### planner (client)

```
$ cd planner
$ mvn clean test
```

* Download the stub from local maven repository.
* Use the stub in the test as mock of toposervice service.
* The test is passed successfully.

## Author

[David Rojo(@david-rojo)](https://github.com/david-rojo)
