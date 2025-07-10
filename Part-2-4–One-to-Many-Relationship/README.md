# 🧩 Spring Boot JPA – One-To-Many (OTM) Relationship

This project demonstrates how to implement a One-to-Many (OTM) and Many-to-One mapping using Spring Boot and Spring Data JPA.  
It models a real-world scenario where a single `Employee` can be associated with multiple `Address` entries — capturing how foreign keys, cascading, and orphan removal work in JPA.

---

## 📂 Project Name: 43-JpaRelationship-OTM

### 🧪 Scenario:
We have two entities:
- `Employee` (Parent)
- `Address` (Child)

Each employee can have multiple addresses (permanent, present, etc.), and each address belongs to one employee.

---

### 🔍 Highlights & Concepts Covered

- Defined **One-to-Many** mapping using `@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)`
- Linked child entities with `@ManyToOne` and foreign key via `@JoinColumn(name = "emp_id")`
- Demonstrated **bidirectional navigation** and **entity association**
- Used `orphanRemoval` to ensure cleanup of child entities when parent is deleted or modified
- Managed cascading CRUD operations to reduce redundant save calls
- Showed two approaches to persisting data:
  - Saving via Parent (`Employee`)
  - Saving via Child (`Address`) after assigning parent reference
- Implemented entity design in a real-world format (HRMS-like structure)

---

### ✅ Use Cases
- 📌 Building HR systems, payroll, address books, or user profile modules
- 📌 Systems where parent-child mapping and automatic cascading is needed
- 📌 Maintaining integrity and reducing boilerplate in multi-table relationships

---

### 🧠 Tech Stack Used
- Java 21  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  
- Hibernate  
- Lombok  
- IntelliJ IDEA  

---

### 🚀 How to Run
1. Clone the repo  
2. Start MySQL on port `3306` and create a database named `sbms`  
3. Update DB credentials in `application.yml`  
4. Run the `Application.java` file  
5. Uncomment the desired method call inside `main()` to test each flow

---

### 📌 Available Methods
- `saveEmp()` – Save Employee with multiple Addresses  
- `saveAdd()` – Save Addresses with Employee manually  
- `getEmployee()` – Fetch Employee and view associated Addresses  
- `getAddress()` – Fetch a single Address  
- `deleteEmp()` – Delete Employee (cascades and removes child addresses)

---

### 📷 Screenshots (Recommended)
- Table structure in DB showing FK relationship  
- Console logs after saving Employee with multiple Addresses  
- Before/After of orphanRemoval effect  
- Entity diagram (optional but helpful)

---

### 🔖 Tags
`@OneToMany`, `@ManyToOne`, `cascade`, `orphanRemoval`, `JPA Relationships`, `Spring Boot`, `MySQL`

---

### 🌐 Series Context
This project is part of the **Spring Boot | Microservices | DevOps** series.  
Check out the full GitHub learning series here 👉 `spring-boot-microservice-devops-learning-series`

---

### 🙌 Let’s Connect!
If you’re exploring real-world backend modeling with Spring, feel free to reach out!  
Feedback and suggestions are welcome. 🚀
