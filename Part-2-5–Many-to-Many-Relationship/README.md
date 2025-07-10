# 📘 Project: 44-Jpa-MTM

### 📂 Part of: Spring Boot | Microservices | DevOps Learning Series  
**Topic:** Many-to-Many Mapping in Spring Data JPA  
**Series Repo:** [`spring-boot-microservice-devops-learning-series`](https://github.com/your-username/spring-boot-microservice-devops-learning-series)

---

## 📌 Overview

This project demonstrates how to implement a **Many-to-Many relationship** using **Spring Data JPA**.  
It models a `User` who can have multiple `Roles`, and each `Role` can be associated with multiple `Users`.

This is a very common pattern used in:

- Role-Based Access Control (RBAC) systems
- User permissions & authorities
- Course-student enrollment platforms

---

## 🧱 Entity Design

### `User` Entity
- Fields: `userId`, `uname`, `gender`
- Has `@ManyToMany` association with `Role` using `@JoinTable`

### `Role` Entity
- Fields: `roleId`, `roleName`
- Mapped back to `User` using `mappedBy = "roles"`

---

## 🔁 Mapping & JPA Features Practiced

- `@ManyToMany` relationship mapping
- `@JoinTable` to define the join table (`user_roles`)
- Bi-directional navigation between User and Role
- `CascadeType.ALL` to persist child records automatically
- Automatic join table generation and population

---

## 🚀 What You Can Learn from This

- ✅ Modeling many-to-many relationships with clean design
- ✅ How to configure custom join tables and column names
- ✅ Managing entity associations through code, not SQL
- ✅ When and why to use cascading operations
- ✅ How to keep entity design aligned with real-world data models

---

## 🔧 Tech Stack Used

| Tech             | Version       |
|------------------|---------------|
| Java             | 21            |
| Spring Boot      | Latest Stable |
| Spring Data JPA  |               |
| MySQL            | 8.x           |
| Hibernate        |               |
| Maven            |               |
| Lombok           |               |
| IntelliJ IDEA    |               |

---

## 🧪 How to Run

1. Make sure MySQL is running on `localhost:3306` with database `sbms`
2. Update `application.yml` if needed
3. Run the `Application.java` class

```bash
mvn spring-boot:run


📬 Contact & Feedback
Have suggestions or want to collaborate?
Connect on LinkedIn or drop a message anytime!

🔖 Tags
#SpringBoot #JPA #ManyToMany #SpringDataJPA #JavaDeveloper #BackendEngineering #Microservices


