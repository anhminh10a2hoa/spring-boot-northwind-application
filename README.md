# NORWIND PROJECT

This project simulate Northwind database exam of Microsoft by using:
- Restful
- Spring boot
- VAMK's MySQL

## Features

- GET, POST, PUT, DELETE method
- Swagger for user interface
- Auto generates entities class
- Auto generates controllers and repositories

## Tool

- git : using git for managing ,editing and updating
- mvn : build automation tool used primarily for Java projects
- vsc : providing many packages to edit your source code

## Installation and Usage

- Step 1: Create a project from [Spring](https://start.spring.io/). And you need to add Spring Web, Spring Security, Spring Data JPA, Lombok and MySQL driver dependencies.

- Step 2: Config ``` application.properties file ``` for connecting to database, enabling https, changing port and so on

- Step 3: Using Lombok-wired JPA, we can easilly generate entities by running command

```
mvn jpa-entity-generator:generateAll
```

- Step 4: The program can auto-create all the Controllers and Repositories files by using ``` generateControllerandRepository.java ``` and follow this [link](https://git.vamk.fi/e1800956/Auto_create_Repository_and_Controller) before using

- Step 5: Create keystore by using command 

```
keytool -genkeypair -alias e1800956 -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore e1800956.p12 -validity 3650
```
- Step 6: Enable HTTPS, by adding some properties to ``` application.properties ```

``` Java
# The format used for the keystore. It could be set to JKS in case it is a JKS file
# server.ssl.key-store-type=PKCS12
# The path to the keystore containing the certificate
server.ssl.key-store=classpath:keystore/e1800956.p12
# The password used to generate the certificate
server.ssl.key-store-password=123456
# The alias mapped to the certificate
server.ssl.key-alias=e1800956
security.require-ssl=true
```

- Step 7: Create a file ``` WebSecurityConfig.java ``` for authentication and add some properties to ``` application.properties ```

```
spring.ldap.embedded.ldif=classpath:test-server.ldif
spring.ldap.embedded.base-dn=dc=springframework,dc=org
spring.ldap.embedded.port=8389
```

- Step 8: Run the project by using command:
```
mvn package
```

```
java -jar target/northwind-0.0.1-SNAPSHOT.jar
```

- Step 9: Add file ``` SpringFoxConfig.java ``` for using swagger We can easily send requests to the server by any REST client, or by accessing to the page

```https
https://localhost:8443/swagger-ui.html#/
```





