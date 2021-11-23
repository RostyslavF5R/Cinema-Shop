# Cinema Shop

## About The Project
This is a web project, which could be characterized as a simple cinema shop realization. The project is based on the principles of SOLID and three-tier software architecture. Besides, such frameworks as Spring Web, Spring REST, Spring Security, Hibernate  have been used to accomplish the cinema shop. Authentication and authorization are also represented as a part of a project. HTTP requests can be sent in JSON format and are stored in a database.

## Futures
You are given the following endpoints:

POST: /register - all<br/>
GET: /cinema-halls - user/admin<br/>
POST: /cinema-halls - admin<br/>
GET: /movies - user/admin<br/>
POST: /movies - admin<br/>
GET: /movie-sessions/available - user/admin<br/>
GET: /movie-sessions/{id} - user/admin<br/>
POST: /movie-sessions - admin<br/>
PUT: /movie-sessions/{id} - admin<br/>
DELETE: /movie-sessions/{id} - admin<br/>
GET: /orders - user<br/>
POST: /orders/complete - user<br/>
PUT: /shopping-carts/movie-sessions - user<br/>
GET: /shopping-carts/by-user - user<br/>
GET: /users/by-email - admin<br/>

## Technologies

- Java 11
- Hibernate
- MySql
- Spring Web
- Spring REST
- Spring Security
- Tocmcat 9
- Maven

## Setup

- Install <a href="https://www.jetbrains.com/ru-ru/idea/download/#section=windows">IntelliJ IDEA Ultimate</a>
- Install <a href="https://mkyong.com/maven/how-to-install-maven-in-windows/">Maven</a>
- Install <a href="https://tomcat.apache.org/download-90.cgi">Tomcat</a> version 9
- Install <a href="https://dev.mysql.com/downloads/installer">MySQL</a>
- Fork this project and clone it to IntelliJ IDEA
- Open `db.properties` file in `src/main/resources` folder and add your info:
```
#MySQL properties
db.driver=YOUR_DRIVER
db.url=YOUR_DATABASE_URL
db.user=YOUR_USERNAME
db.password=YOUR_PASSWORD

#Hibernate properties
hibernate.show_sql=true
hibernate.hbm2ddl.auto=create
hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
- Run this project using Tomcat local server<br/>

You will be redirected to login page. You can use default users:
- email: bob@gmail.com, password: 12345678 (admin role)
- email: user@gmail.com, password: 87654321 (user role)
