# fornecedor-api 

API ORIGINAL CRIADA POR [feltex](https://www.youtube.com/c/FeltexBr).

Esta é uma versão com modificações feitas com base nas minha necessidades.
Para mais vídeos e tutorias acesse o canal [feltex](https://www.youtube.com/c/FeltexBr)

  API para gerenciar os dados de Fornecedores. É possível fazer a inclusão, alteração, consulta, listagem e exclusão de clientes.
  Neste projeto mostraremos como armazenar arquivos no MySQL.



## 🚀 Tecnologias usadas
-[Java](https://www.java.com/pt-BR/)
-[Maven](https://maven.apache.org/)
-[Spring Boot](https://spring.io/projects/spring-boot)
-[Docker Compose](https://docs.docker.com/compose/)
-[Postman](https://www.postman.com/)

## Configurar banco de dados MySQL

  Utilizado o Docker para executar o MySQL neste exemplo. 

 Acesse a pasta docker e execute o comando:
    
    docker-compose up

 Se não quiser utilizar o Docker você precisa ter o MySQL instalado no seu computador e precisará criar um banco de dados 
com o nome `clientedb`. Atualize o usuário e senha no arquivo `application.properties` para os dados do seu banco de dados

    spring.datasource.username=root
    spring.datasource.password=feltex


## Iniciar a aplicação

  Existem algumas formas de iniciar esta API

    java -jar target/cliente-api.jar

ou utilizando o maven

    mvn spring-boot:run


## Criando a imagem Docker da API

    docker build -t andrefelix/cliente-api:V1  .

    docker push andrefelix/cliente-api:V1
