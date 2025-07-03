# 🚀 Part 1: Spring Boot Fundamentals (Basic Boot)

This section contains beginner-friendly Spring Boot projects that introduce core concepts such as dependency injection, lifecycle methods, command-line runners, and bean creation using annotations.

---

## 📌 Included Projects

### `01-SpringBoot-App`
A minimal Spring Boot application demonstrating:
- `@Service`, `@Repository` bean creation
- Simple constructor logging
- Manual bean registration using `@Bean`

🔧 *Technologies used:* Spring Boot, Java 21

---

### `02-SpringBoot-Runner`
This project demonstrates:
- Use of `ApplicationRunner` and `CommandLineRunner`
- Lifecycle methods: `@PostConstruct`, `@PreDestroy`
- Controlled context closing using `context.close()` in `main()`

🔧 *Technologies used:* Spring Boot, Java 21

---

### `03-SpringBoot-DI-App`
Demonstrates all 3 types of dependency injection in Spring Boot:
- Field injection
- Constructor injection
- Setter injection

Includes a small logic where name is fetched by user ID using service + DAO layers.

🔧 *Technologies used:* Spring Boot, Java 21

---

## 🧠 What I Learned

- How Spring Boot manages beans internally using annotations
- How `@Bean`, `@Component`, `@Service`, and `@Repository` work
- Spring lifecycle events and bean destruction
- Runners (`ApplicationRunner` and `CommandLineRunner`) to run custom logic on app startup
- The importance and application of different types of dependency injection

---

## 📌 Tech Used in This Part

- Java 21
- Spring Boot (v3+)
- Maven (build tool)
- IntelliJ IDEA / VS Code (optional)

---

## 🔗 GitHub Repo

Main Repository: [spring-boot-microservices-devops-series](https://github.com/Aashu1719/spring-boot-microservices-devops-series)

> I shared this part of the series live on LinkedIn to showcase the foundation of my Spring Boot journey.  
> Connect with me and follow for more hands-on projects in this series!



📍 Stay tuned for [Part 2 → JPA Projects]