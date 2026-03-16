# Study APIR

Projeto de estudo utilizando Spring Boot

## 🚀 Instruções de uso

- Para executar a aplicação:

  ```
  mvn spring-boot:run
  ```


## ⚙️ Configurações no application.properties

- Porta da aplicação:
  ```
  server.port=9000
  ```

- Caminho da documentação Swagger  
  ```
  springdoc.swagger-ui.path=/
  ```


## 📦 Dependências

Este projeto utiliza as seguintes dependências:

- **Spring Boot DevTools**
- **Spring Web**
- **SpringDoc OpenAPI**

## 📜 Execução via .jar

O projeto pode ser empacotado e executado como um arquivo .jar.

- Gerar o .jar

  ```
  mvn package
  ```

- Remover o .jar

  ```
  mvn clean
  ```

- Limpar artefatos antigos e gerar novo .jar

  ```
  mvn clean package
  ```

- Executar a aplicação pelo .jar

  ```
  java -jar target/nome-do-jar.jar
  ```

- Para manter um nome fixo para o arquivo .jar em todas as versões, configure o pom.xml da seguinte forma:

  ```
  <build>
      <finalName>app</finalName>
      ...
  </build>
  ```

- Após isso, o comando para executar será sempre:

  ```
  java -jar target/app.jar
  ```
