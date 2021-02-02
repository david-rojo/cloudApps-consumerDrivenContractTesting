# Consumer Driven Contract Testing (CDCT) scenario

**Planner** service uses **toposervice** service to know the landscape of given city. Both services are going to be developed by different teams and they must be deployed anytime without depending on each other and
ensuring compatibility between them. For this purpose, both development teams have agreed to use *Consumer Driven Contract Testing* using [Spring Cloud Contract](https://spring.io/projects/spring-cloud-contract).

It is requested:

* Define a contract for ```getCity``` endpoint in toposervice service. This contract must return a city and its landscape.
* Configure toposervice service in order that it can validate the contract against API implementation provided by toposervice.
* Configure planner service and implement a test that verify the desired performance of ```getCity``` endpoint from toposervice service.
