# 📚 Library Management API

A **Spring Boot REST API** for managing library resources. The project uses **Java 17, Spring Boot, Spring Data JPA and MySQL** to provide a structured backend application.

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3.3.1**
- Spring Web
- Spring Data JPA / Hibernate
- MySQL
- Maven

## ✨ Core Capabilities

- Manage library books through REST endpoints
- Persist application data in MySQL
- Use JPA repositories for database access
- Organize backend code using controllers and persistence layers

## 🧱 Backend Architecture

```text
REST Client
    ↓
Controller Layer
    ↓
Service / Business Logic
    ↓
Repository Layer
    ↓
MySQL Database
```

## ▶️ Run Locally

### Prerequisites

- Java 17+
- Maven
- MySQL

### Steps

```bash
git clone https://github.com/rahulkryadav007/Library-Management-API.git
cd Library-Management-API
mvn spring-boot:run
```

Configure the database connection in `src/main/resources/application.properties` before starting the application.

## 📌 What This Project Demonstrates

- REST API development with Spring Boot
- Spring Data JPA and Hibernate
- MySQL database integration
- Java backend project structure
- CRUD-oriented application design

## 👨‍💻 Author

**Rahul Kumar Yadav**

Java Backend Developer | Spring Boot | Python | IT Trainer
