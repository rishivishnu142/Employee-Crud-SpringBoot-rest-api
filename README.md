<div align="center">

# Employee CRUD REST API using Spring Boot

A RESTful Employee Management API built with **Spring Boot**, **Java**, and **Maven**, demonstrating clean API design, CRUD operations, and layered architecture.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.0-green?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![REST API](https://img.shields.io/badge/REST-API-blue?style=for-the-badge)
![Postman](https://img.shields.io/badge/Tested-Postman-orange?style=for-the-badge&logo=postman)

</div>

---

# Overview

This project is a simple yet structured **Employee Management REST API** developed using **Spring Boot**. It demonstrates the implementation of RESTful web services following a layered architecture.

The application exposes HTTP endpoints for performing CRUD (Create, Read, Update, Delete) operations on employee records and serves as a foundation for enterprise-level backend development.

---

# Features

- RESTful API implementation
- Create Employee
- Retrieve All Employees
- Retrieve Employee by ID
- Delete Employee
- JSON Request & Response
- Layered Architecture
- Maven Project Structure
- Tested using Postman
- Easy to extend for database integration

---

# Technology Stack

| Technology | Version |
|------------|---------|
| Java | 17 |
| Spring Boot | 4.1.0 |
| Maven | Latest |
| REST API | HTTP |
| Eclipse IDE | 2026 |
| Postman | API Testing |

---

# Project Structure

```
employee-spring
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.example.demo
│   │       │
│   │       ├── controller
│   │       │      EmployeeController.java
│   │       │
│   │       ├── service
│   │       │      EmployeeService.java
│   │       │
│   │       ├── entity
│   │       │      Employee.java
│   │       │
│   │       └── EmployeeSpringApplication.java
│   │
│   └── resources
│          application.properties
│
├── pom.xml
│
└── README.md
```

---

# Project Architecture

```
                Client / Postman
                       │
                       │ HTTP Request
                       ▼
          EmployeeController
                       │
                       ▼
             EmployeeService
                       │
                       ▼
               Employee Entity
                       │
                       ▼
               JSON Response
```

---

# REST API Endpoints

## Get All Employees

```
GET /api/employees
```

---

## Get Employee By ID

```
GET /api/employees/{id}
```

Example

```
GET /api/employees/1
```

---

## Create Employee

```
POST /api/employees
```

### Request Body

```json
{
    "id":1,
    "name":"Rishi",
    "email":"rishi@gmail.com",
    "department":"IT",
    "salary":50000,
    "joindate":"2026-07-14"
}
```

---

## Delete Employee

```
DELETE /api/employees/{id}
```

Example

```
DELETE /api/employees/1
```

---

# Sample Response

```json
[
  {
    "id":1,
    "name":"Rishi",
    "email":"rishi@gmail.com",
    "department":"IT",
    "salary":50000,
    "joindate":"2026-07-14"
  }
]
```

---

# Running the Project

## Clone Repository

```bash
git clone https://github.com/rishivishnu142/Employee-Crud-SpringBoot-rest-api.git
```

---

## Navigate to Project

```bash
cd Employee-Crud-SpringBoot-rest-api
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Application

```bash
mvn spring-boot:run
```

Or simply run

```
EmployeeSpringApplication.java
```

from Eclipse or IntelliJ IDEA.

---

# Base URL

```
http://localhost:9090
```

---

# API Base Endpoint

```
http://localhost:9090/api
```

---

# API Testing

The APIs were tested successfully using **Postman**.

Available operations include:

- GET
- POST
- DELETE

---

# Employee Model

| Field | Type |
|---------|------|
| id | long |
| name | String |
| email | String |
| department | String |
| salary | BigDecimal |
| joindate | LocalDate |

---

# Future Enhancements

- Spring Data JPA
- MySQL / Oracle Database Integration
- Hibernate ORM
- PUT (Update Employee)
- Bean Validation
- Exception Handling
- Swagger/OpenAPI Documentation
- Lombok
- Docker Support
- JWT Authentication
- Spring Security
- Unit Testing using JUnit & Mockito

---

# Learning Outcomes

This project demonstrates understanding of:

- Spring Boot Fundamentals
- RESTful Web Services
- Layered Architecture
- Request Mapping
- HTTP Methods
- JSON Serialization
- Maven Project Management
- API Testing with Postman

---

# Author

**Rishikesh V**

GitHub

https://github.com/rishivishnu142

---

# Repository

https://github.com/rishivishnu142/Employee-Crud-SpringBoot-rest-api

---

# License

This project is developed for educational and learning purposes.

---

<div align="center">

### ⭐ If you found this project helpful, consider giving it a Star!

</div>
