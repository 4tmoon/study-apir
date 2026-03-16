# Study APIR
API de estudo de Spring Boot


## 🚀 Instruções de uso
Para executar a aplicação diretamente pelo Maven:
```
mvn spring-boot:run
```


## 📦 Dependências
Este projeto utiliza as seguintes dependências:
- **Spring Boot DevTools** 
- **Spring Web**
- **SpringDoc OpenAPI** 


## ⚙️ Configuração de porta
A porta padrão pode ser alterada no arquivo `application.properties`:
```
server.port=9000
```


## 📜 Executando via .jar
O projeto pode ser empacotado e executado como um arquivo `.jar`.

### Gerar o `.jar`
```
mvn package
```

### Remover o `.jar`
```
mvn clean
```

### Remover versão antiga e gerar nova
```
mvn clean package
```

### Executar a aplicação pelo `.jar`
```
java -jar target/nome-do-jar.jar
```

### Definir nome fixo para o `.jar`
Para não precisar alterar manualmente o nome do arquivo a cada versão, configure o `pom.xml`:
```
<build>
    <finalName>app</finalName>
    ...
</build>
```

Após isso, o comando para executar será sempre:
```
java -jar target/app.jar
```
