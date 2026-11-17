SOA Programming - Addition API (working project)

Import into STS: File > Import > Maven > Existing Maven Projects > select this folder > Finish.
Run AdditionContractApplication.java as Spring Boot App.
Test: http://localhost:8080/api/add?a=10&b=20
Expected JSON: {"result":30}

The project includes both the OpenAPI YAML contract and the working REST controller.
