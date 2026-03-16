# Cliente API

Microserviço desenvolvido com Spring Boot utilizando Java 11 e Maven.  
A aplicação fornece uma API REST para cadastro, consulta, atualização e exclusão de clientes.

## Tecnologias utilizadas

- Java 11
- Spring Boot
- Spring Data JPA
- H2 Database (memória)
- Spring Security
- RabbitMQ
- JUnit / Mockito
- Maven

## Como executar a aplicação

1. Clonar o repositório:

git clone https://github.com/guiguel/clienteClaro.git

2. Entrar na pasta do projeto:

cd clienteClaro

3. Executar a aplicação:

mvn spring-boot:run

A aplicação iniciará em:

http://localhost:8080

## Banco de dados H2

Console disponível em:

http://localhost:8080/h2-console

Configuração:

JDBC URL: jdbc:h2:mem:clientedb  
User: sa  
Password: (vazio)

## Endpoints da API

Base URL:

http://localhost:8080/clientes

## Criar cliente

curl -X POST http://localhost:8080/clientes \
-H "Content-Type: application/json" \
-d '{
"nome":"Manoel Rosa",
"cpf":"12345678900",
"endereco":"Rua A Canoas",
"email":"manoel@email.com",
"telefone":"51999999999"
}'

## Listar clientes

curl http://localhost:8080/clientes

## Buscar cliente por id

curl http://localhost:8080/clientes/1

## Atualizar cliente

curl -X PUT http://localhost:8080/clientes/1 \
-H "Content-Type: application/json" \
-d '{
"nome":"Manoel Rosa Atualizado",
"cpf":"12345678900",
"endereco":"Rua B Canoas",
"email":"manoel@email.com",
"telefone":"51999999999"
}'

## Excluir cliente

curl -X DELETE http://localhost:8080/clientes/1

## Executar testes

mvn test


## Futuras melhorias
- Tratamento global de erros
- Implementação swagger.