# RESTful API - Bank Project

# Sobre o projeto

WORK IN PROGRESS...

## Objetivos
WORK IN PROGRESS...

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
WORK IN PROGRESS...

## Implantação em produção
WORK IN PROGRESS...



# Autor

Luccas Gonçalves Irineu

https://www.linkedin.com/in/luccas-goncalves/

