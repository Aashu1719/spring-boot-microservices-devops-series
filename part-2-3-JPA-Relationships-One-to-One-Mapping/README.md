# 🚀 Spring Boot | Microservices | DevOps Series – Part 2.3: JPA One-to-One Relationship

In this part of the series, I explored entity relationships in Spring Data JPA. Specifically, I implemented a **One-to-One bidirectional mapping** between `Person` and `Passport`. This helped me understand how **cascading works**, how **foreign keys are created**, and how **parent-child operations behave** in JPA.

---

## 📁 Project Covered

### 🔹 Project Name: `42-JpaRelationship`

- Implemented **One-to-One bidirectional mapping** using `@OneToOne` and `@JoinColumn`
- Used `cascade = CascadeType.ALL` to propagate parent entity operations to the child
- Designed entity relationship where `Passport` is the child and `Person` is the parent
- Added CRUD methods: save, get parent, get child, delete
- Understood how **foreign keys** are handled and maintained in a relational DB

---

## 💡 What I Explored & Use Cases

✔ Designed real-world use case of One-to-One mapping (e.g., Person-Passport)  
✔ Understood bidirectional navigation with mappedBy and owning side  
✔ Learned cascading impact on associated entities  
✔ Used `@JoinColumn` to define foreign key explicitly  
✔ Explored how deleting a parent deletes the child too when using cascade  
✔ Practiced retrieval from both parent and child side

---

## ✅ Use Case

Use One-to-One mapping when:

- You have exclusive ownership between two entities (e.g., A person has one passport)
- You want tightly coupled data with synchronized operations
- You want cascade effects on related data

---

## 🧠 Tech Stack Used

- Java 21  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Hibernate  
- Maven  
- Lombok  
- IntelliJ IDEA  

---

## 🔧 How to Run

1. Clone the repository
2. Configure your MySQL DB in `application.yml`
3. Run `Application.java`
4. Uncomment different service methods to test: `savePerson()`, `getPerson()`, `getPassport()`, `deletePerson()`

---

## 📸 Suggested Screenshots for LinkedIn Post

- ✅ Code of `@OneToOne` + `@JoinColumn` in `Passport.java`
- ✅ Code of `mappedBy` and `CascadeType.ALL` in `Person.java`
- ✅ Console output showing saved or deleted data

---

## 🔜 Coming Up Next

📦 **Part 3.1 – JPA One-to-Many Relationship**  
Learn how to manage lists of dependent entities with parent-child mappings and cascading behavior.

---

## 🙌 Let’s Connect!

If you're into backend design, Spring Boot, or clean architecture — let’s connect!  
Feedback, questions, and collab ideas are welcome — drop a message anytime.

---

## 🔖 Hashtags

#SpringBoot #JavaDeveloper #SpringDataJPA #OneToOne #EntityRelationships  
#BackendEngineering #OpenToWork #Microservices #GitHubProjects #DevJourney
