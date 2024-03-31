# TodoList - API

API para gerenciar tarefas (CRUD) que faz parte <a href="https://github.com/simplify-tec/desafio-junior-backend-simplify">desse desafio</a> para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

Este projeto é uma aplicação de lista de afazeres desenvolvida em Java utilizando o framework Spring Boot e um banco de dados MySQL. Ele oferece uma solução simples e eficaz para gerenciar e acompanhar tarefas diárias ou projetos em um ambiente de desenvolvimento de software.

# Tecnologias:
- <a href="https://spring.io/projects/spring-boot">Spring Boot</a>
- <a href="https://docs.spring.io/spring-framework/reference/web/webmvc.html">Spring MVC</a>
- <a href="https://spring.io/projects/spring-data-jpa">Spring Data JPA</a>
- <a href="https://springdoc.org/v2/#spring-webflux-support">SpringDoc OpenAPI 3</a>
- <a href="https://dev.mysql.com/downloads/">MySql</a>

## Práticas Adotadas
- SOLID, DRY, YAGNI, KISS
-  API REST
-  Consultas com Spring Data JPA
-  Injeção de Dependências
-  Tratamento de respostas de erro
-  Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Tarefa 
```
$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Listar Tarefas
```
$ http GET :8080/todos

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Atualizar Tarefa
```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remover Tarefa
```
http DELETE :8080/todos/1

[ ]
```



Este projeto é uma excelente oportunidade para praticar os conceitos de desenvolvimento de backend usando Java Spring Boot, além de aprender sobre integração com banco de dados relacional e construção de APIs RESTful.
