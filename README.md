# RESTful API - Bank Project

# Sobre o projeto

Projeto para criar o backend da tela inicial do aplicativo Santander utilizando java, banco de dados(h2 e PostgreSQL) e o framework Spring. 

## Objetivos
- Entender o modelo conceitual
- Criar diagrama de classes de acordo com o modelo conceitual
- Implementar o diagrama de classes
- Dividir em camadas: Controller, Service e Repository que são respectivamente: Requisições http, regras de negócio e banco de dados.
- Atribuir as associações entre classes
- Utilizar Spring JPA para realizar as interações com o banco de dados
- Utilizar banco de dados H2 para o ambiente de desenvolvimento
- Utilizar PostgreSQL para o ambiente de produção
- Realizar o deploy da aplicação no Railway

## Modelo conceitual
![Modelo Conceitual](https://github.com/luccasirineu/api-bootcamp/blob/main/assets/modeloConceitual.png)

## Diagrama de classes

``` mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News[] news
    }
    
    class Account {
        -String number
        -String agency
        -String balance
        -String limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -String limit
    }

    class News {
        -String icon
        -String description
    }
    
    User "1" *--> "1" Account
    User "1" *--> "0..*" Feature
    User "1" *--> "1" Card
    User "1" *--> "0..*" News
```


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Spring JPA
- Banco de dados H2(em ambiente de desenvolvimento)
- Swagger
     

## Implantação em produção
- PostgreSQL(em ambiente de produção)

## Deploy na nuvem
- Railway



# Autor

Luccas Gonçalves Irineu

https://www.linkedin.com/in/luccas-goncalves/

