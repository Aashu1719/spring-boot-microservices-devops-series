# 🧩 13-web-mvc – Spring MVC Fundamentals

This project demonstrates the core concepts of **Spring MVC** (Model-View-Controller) architecture using **Spring Boot**. It’s a beginner-friendly web application that handles basic routing, data passing, and dynamic HTML rendering using **Thymeleaf**.

---

## 📌 Key Features

- 🌐 Basic multi-page web application setup  
- 📥 HTTP GET & POST handling with `@RequestMapping` and `@GetMapping/@PostMapping`  
- 📦 Data passing between Controller and View using `Model`  
- 🧾 Simple form submission and user input processing  
- 🎨 HTML templates with dynamic content using **Thymeleaf**  
- 🔁 Routing and redirect functionality  

---

## 🧠 Concepts Covered

- Understanding Spring’s **DispatcherServlet** flow  
- Mapping URLs to controller methods  
- Passing and rendering dynamic values in the UI  
- Form handling in Spring MVC  
- Clean separation of concerns using MVC  

---

## 📂 Project Structure

13-web-mvc
├── src
│ └── main
│ ├── java
│ │ └── com.example.webmvc
│ │ ├── controller
│ │ │ └── HomeController.java
│ │ └── WebMvcApplication.java
│ └── resources
│ ├── templates
│ │ ├── home.html
│ │ └── about.html
│ └── application.properties
├── pom.xml
└── README.md

yaml
Copy
Edit

---

## 🚀 Getting Started

### Prerequisites
- Java 21  
- Maven  
- IDE (IntelliJ / Eclipse / VS Code)  

### Run the Project

```bash
# Clone the repo
git clone https://github.com/your-username/Projects.git

# Navigate to the project directory
cd 13-web-mvc

# Run using Maven
mvn spring-boot:run
Visit: http://localhost:8080/

🧪 Sample Endpoints
URL	Description
/	Homepage
/about	About Page
/form	Form Page (if implemented)

🔧 Tech Stack
Java 21

Spring Boot

Spring MVC

Thymeleaf

Maven

HTML + Bootstrap

📌 Useful Annotations
@Controller

@RequestMapping, @GetMapping, @PostMapping

Model interface

@SpringBootApplication