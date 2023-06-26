# microservices

Este é um projeto que utiliza arquitetura de microserviços para lidar com diferentes aspectos de um sistema de pedidos e pagamentos.

## Tecnologias Utilizadas

- **Spring Boot**
- **MySQL**
- **Eureka**
- **Gateway**
- **Lombok**
- **Flyway**
- **OpenFeign**
- **Design Patterns (Circuit Breaker)**

## Endpoint Gateway

O gateway utilizado neste projeto permite acessar diferentes microserviços através de um ponto de entrada único.

### Microserviço de Pagamentos

Endpoint para acessar o microserviço de pagamentos:

``` http://localhost:8082/pagamentos-ms/pagamentos ```


### Microserviço de Pedidos

Endpoint para acessar o microserviço de pedidos:

```http://localhost:8082/pedidos-ms/pedidos```
