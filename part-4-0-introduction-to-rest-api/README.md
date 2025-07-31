# 17-web-mvc-rest-api-basics

This is a beginner-level Spring Boot project demonstrating the basics of creating RESTful APIs using Spring MVC and the `@RestController` annotation. It covers fundamental concepts like handling path variables, request parameters, returning responses, and HTTP status codes.

## 🧰 Tech Stack Used

- Java 21  
- Spring Boot  
- Spring MVC  
- Maven  

## 📌 Key Features

- Created a `@RestController` class to expose basic REST endpoints.
- Used `@GetMapping` to define HTTP GET APIs.
- Handled dynamic data using:
  - `@PathVariable` for URL-based inputs.
  - `@RequestParam` for query parameter-based inputs.
- Returned responses using `ResponseEntity` with appropriate `HttpStatus` codes.
- Returned void response (`204 No Content`) using `ResponseEntity<Void>`.

## 📂 Project Structure

rest_api.rest/
├── MsgRestController.java # Main controller class with REST endpoints
└── ...

pgsql
Copy
Edit

## 🔍 API Endpoints

| Endpoint              | Method | Description                          | Example                          |
|-----------------------|--------|--------------------------------------|----------------------------------|
| `/welcome/{name}`     | GET    | Returns a welcome message            | `/welcome/Aashu`                |
| `/greet?name={name}`  | GET    | Returns a greeting using query param | `/greet?name=Ram`               |
| `/action`             | GET    | Logs an action and returns no content| `/action`                        |

## 🧪 Example Output

```bash
GET /welcome/Aashu
Response: 200 OK
Body: Welcome to Rest API..!!Aashu

GET /greet?name=Ram
Response: 200 OK
Body: Ram, Good Morning!!!

GET /action
Response: 204 No Content
✅ How to Run the Application
Clone the repository

Open the project in your favorite IDE (IntelliJ / Eclipse)

Run the application using the main class

Access the endpoints via Postman or browser