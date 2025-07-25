# 🧩 Spring MVC – Global Exception Handling Example

This is a simple Spring MVC web application that demonstrates **global exception handling** using `@ControllerAdvice` and `@ExceptionHandler`. It helps manage unexpected errors centrally and display a user-friendly error page instead of breaking the flow with raw stack traces.

## 📁 Project: 15-web-mvc-exception-handling

### ✅ What I Practiced & Understood:
- Using `@ControllerAdvice` to handle exceptions globally across all controllers.
- Differentiating between local `@ExceptionHandler` and global error handling.
- Building meaningful error messages using a dedicated error view.
- Integration of Bootstrap to create a simple UI.
- Triggering exceptions purposefully in controller and service layers to simulate scenarios.

### 💡 Use Case
In any real-world web application, errors may occur due to bad input, null data, or runtime failures. This project shows how to gracefully handle such issues by catching exceptions and displaying a friendly message to the user.

---

## 🔧 Tech Stack Used:
- Java 21
- Spring Boot 3
- Spring MVC
- Thymeleaf
- Bootstrap 5
- Maven

---

## 🧪 How to Test It
1. Run the application.
2. Hit:
   - `http://localhost:8080/welcome` – Simulates a division-by-zero error.
   - `http://localhost:8080/product` – Another exception via service layer.
   - `http://localhost:8080/greet` – A normal request that shows a greeting.

You'll see:
- A friendly error page for `/welcome` and `/product`
- A working response for `/greet`

---

## 📂 Project Structure
15-web-mvc-exception-handling/
├── controller/
│ ├── DemoController.java
│ └── ProductController.java
├── service/
│ └── ProductService.java
├── exception/
│ └── AddExceptionHandler.java
├── templates/
│ ├── index.html
│ └── ErrorView.html

yaml
Copy
Edit

---

## ✅ Output Example
- `Good Morning` or `Welcome to Ashok IT...!!`
- Error message page with:  
  `"Some problem occurred, Please try after some time!"`

---

## 📌 Learning Outcome
Learned how to manage unexpected issues elegantly and redirect users to a helpful 