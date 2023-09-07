# Hibernate

A framework for persisting/saving Java objects in a database

# JPA
Jakarta Persistence API: Standard API for Object-to-Relational-Mapping (ORM)

Hibernate: most popular of JPA specification implementation, default implementation used in spring boot

Hibernate/JPA is just another layer on top of JDBC

# Entity Class: Java class that is mapped to a db table
- must be annotated with @Entity
- must have a public or protected no-argument constructor 

# @Table(name="") and @Column(name="")

# JPA Identity

- @GeneratedValue(strategy=GenerationType.IDENTITY)

# Data Access Object (DAO):
- need a JPA Entity Manager (main component for saving/retrieving content)
- JPA Entity Manager needs a Data Source (defines database connection info)
- JPA Entity Manager and Data Source are automatically created by Spring Boot (base on properties file: JDBC URL, user id, password, etc ...)
- We can autowire/inject the JPA Entity Manager into our Student DAO

DAO <-> Entity Manager <-> Data Source <-> Database

# Spring @Transactional
- Automagically begin and end a transaction for your JPA code, no need for you to explicitly do this in your code, happened behind the scence

# @Repository: sub-annotation of @Component 
- Applied to DAO implementation
- Spring will automatically register the DAO implementation thanks to component scanning
- Spring also provides translation of any JDBC related exceptions