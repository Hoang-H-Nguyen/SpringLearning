## Http Request Message

- Request line: the HTTP command (POST, GET, PUT, DELETE)
- Header variables: request metadata
- Message body: contents of message

## Http Response Message

- Response line: server protocol and status code
- Header variables: response metadata (content type of the data: JSon, XML)
- Message body: contents of message

## Java Json data binding

Data binding is the process of convert Json data to a Java POJO
Spring used Jackson Project to handle data binding

- JSON data being passed to REST controller is converted to Java POJO
- Java POJO being returned from REST controller is converted to JSON

## Service layer
Between Rest Controller and DAO

Service facade design pattern

Intermediate layer for custom business logic

Integrate data from multiple sources (DAO/repositories)