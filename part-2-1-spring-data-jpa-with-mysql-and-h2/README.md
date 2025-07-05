# 🚀 Spring Boot | Microservices | DevOps Series – Part 2-1: Spring Data JPA with MySQL & H2

This part of the learning series covers the fundamentals and practical applications of **Spring Data JPA** using both **MySQL** and **H2 in-memory database**. The focus is on simplifying data access, performing CRUD operations, custom queries, pagination, sorting, and more using the JPA abstraction layer.

---

## 📁 Projects Covered

### 🔹 04-Data-Jpa-App

> A complete Spring Boot JPA project using **MySQL** database.

#### ✅ Features
- Entity mapping using `@Entity`, `@Id`, `@GeneratedValue`, etc.
- CRUD operations using `JpaRepository`
- Derived queries using method naming conventions
- Custom queries using HQL and native SQL
- Pagination & sorting with `PageRequest` and `Sort`
- Query by Example (QBE) for dynamic filters
- Timestamps with `@CreationTimestamp`, `@UpdateTimestamp`
- Soft delete implementation using `activeSw` flag

#### 💡 Use Case
Perfect for backend admin dashboards or CRUD-based internal tools that interact frequently with the database but contain minimal business logic.

---

### 🔹 10-data-jpa-h2

> A minimal project demonstrating JPA with **H2 in-memory database**.

#### ✅ Features
- Integration with H2 DB (`jdbc:h2:mem:test`)
- Lightweight entity definition
- Basic CRUD operations using `JpaRepository`
- No dependency on external DB (ideal for testing)
- H2 Console enabled for interactive inspection

#### 💡 Use Case
Ideal for local testing or prototyping microservices where you don’t want to set up a full MySQL or PostgreSQL instance.

---

## 💡 What I Explored

- Declarative data access using Spring Data JPA
- Primary key auto-generation strategies
- JPA abstraction to eliminate boilerplate CRUD code
- Integration with MySQL and H2 databases
- Pagination, sorting, and QueryByExample usage
- Custom query writing using HQL/native SQL
- Timestamping using Hibernate annotations
- Implementing soft delete logic using flags

---

## 🧠 Tech Stack Used

- Java 21  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- H2 Database  
- Hibernate  
- Maven  
- Lombok  
- IntelliJ IDEA  

---

## 🧪 How to Run

### For `04-Data-Jpa-App`
1. Make sure MySQL is running locally.
2. Create a database named `sbms`.
3. Update `application.yml` with your MySQL credentials.
4. Run `Application.java` from your IDE or use:
   ```bash
   mvn spring-boot:run
