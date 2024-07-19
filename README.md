# Agendamento de Notificação com Java e Spring Boot

Este é um projeto Spring Boot que utiliza Java 17, Spring Boot 3.3.1, Maven, Scheduler, MySQL e Docker Compose.

## Pré-requisitos

- Java 17 instalado
- Maven instalado
- Docker e Docker Compose instalados
- Um banco de dados MySQL configurado (você pode usar o Docker Compose para isso)

## Configuração

1. Clone este repositório.
2. Execute o seguinte comando para construir o projeto: `$ mvn clean install`
3. Configure as propriedades do banco de dados no arquivo `application.properties`.
4. Execute o projeto: `$ mvn spring-boot:run`

## Scheduler

O projeto inclui um agendador (Scheduler) que executa tarefas em intervalos regulares. Você pode personalizar as tarefas agendadas no arquivo `TaskScheduler.java`.

## Docker Compose

Para executar o projeto com Docker Compose, siga estas etapas:

1. Certifique-se de que o Docker Compose esteja instalado.
2. No diretório raiz do projeto, execute: `$ docker-compose up`

Isso iniciará o contêiner do MySQL e o aplicativo Spring Boot.

## Contribuição

Sinta-se à vontade para contribuir com melhorias ou correções neste projeto!

## Licença

Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para obter detalhes.



