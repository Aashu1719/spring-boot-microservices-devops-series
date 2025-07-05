# Spring Boot | Microservices | DevOps Series – Part 2.2: Composite Keys & Transactions in JPA

In this part of the series, I explored advanced features of Spring Data JPA — such as handling **composite primary keys** and managing **transactions** using `@Transactional`. These patterns are crucial for building robust and consistent backend systems where data integrity matters.

---

## 📁 Projects Covered

### 🔹 Project Name: 05-Data-Jpa-Composite-Key

- Used `@Embeddable` and `@EmbeddedId` to define a composite primary key
- Created `BookPk` class to represent identity of a Book entity
- Persisted and retrieved data using the composite key
- Implemented standard CRUD via Spring Data JPA

### 🔹 Project Name: 12-Data-Jpa-Txn-App

- Created `Emp` and `Address` entities with relationships based on foreign keys
- Demonstrated `@Transactional(rollbackFor = Exception.class)`
- Performed rollback by simulating an exception between operations
- Ensured atomic commit of multi-table data operations

---

## 💡 What I Explored & Use Cases

- 🧩 Used multi-column primary keys using `@EmbeddedId`
- 🔐 Ensured transactional consistency using `@Transactional`
- 🧪 Learned rollback mechanisms during exceptions
- 🧠 Practiced entity design where real-world data doesn't rely on a single identifier
- 🔄 These patterns are useful in billing, order systems, and ERP-style modules

---

## ✅ Use Case

These examples are applicable when:
- You need to model composite business keys (e.g., Book ID + Name)
- You’re working on a system where multiple DB operations must succeed or fail together
- You want to test rollback handling or simulate distributed consistency patterns

---

## 🧠 Tech Stack Used

- Java 21  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- Hibernate  
- Lombok  
- IntelliJ IDEA

---


---

## 🔜 Coming Up Next

📦 **Part 3 – JPA Relationships (One-to-Many & Many-to-Many)**  
Learn how to manage complex data models with real-world entity relationships and cascading operations.

---

## 🙌 Let’s Connect!

If you're into backend design, Spring Boot, or clean architecture, let’s connect!  
Feedback, questions, and collab ideas are welcome — drop a message anytime.

---

## 🔖 Hashtags

`#SpringBoot` `#JavaDeveloper` `#SpringDataJPA` `#Transactions` `#CompositeKey` `#BackendEngineering` `#OpenToWork` `#Microservices` `#GitHubProjects` `#DevJourney`
