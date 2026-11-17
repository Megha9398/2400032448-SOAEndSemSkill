
# SOA Programming - Addition API

## Project Description
This project implements an Addition API using Spring Boot and an OpenAPI YAML contract.

## Technologies Used
- Java
- Spring Boot
- Maven
- YAML
- REST API

## API Details

**HTTP Method:** GET

**Endpoint:** `/api/add`

**Parameters:**
- a = 5
- b = 10

## Test URL
http://localhost:8080/api/add?a=5&b=10

## Expected Output
```json
{
  "result": 15
}
```

## Project Structure
- AdditionContractApplication.java
- AdditionController.java
- add-api.yaml
- pom.xml
