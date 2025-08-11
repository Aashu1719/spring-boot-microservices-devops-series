# Spring Boot REST API – JSON Response Example

This project demonstrates how to build basic RESTful APIs in Spring Boot that return JSON responses using POJOs. It simulates simple CRUD operations for a `Customer` entity.

## 🔧 Features

- Define and use a `Customer` POJO (Plain Old Java Object)
- Create REST endpoints using:
  - `@PostMapping` to add a new customer
  - `@PutMapping` to update a customer
  - `@DeleteMapping` to delete a customer
  - `@GetMapping` to fetch a single customer or list of customers
- Use of `@RequestBody`, `@PathVariable`, and `ResponseEntity`
- Automatic JSON serialization via Jackson

## 📦 Tech Stack

- Java 21
- Spring Boot
- Spring Web (Spring MVC)
- Maven
- Lombok

## 📂 Endpoints

| Method | Endpoint           | Description                |
|--------|--------------------|----------------------------|
| POST   | `/customer`        | Add a new customer         |
| PUT    | `/customer`        | Update an existing customer|
| DELETE | `/customer/{cid}`  | Delete a customer by ID    |
| GET    | `/customer`        | Get a single customer      |
| GET    | `/customers`       | Get list of customers      |

## 🧪 Sample Request Body

```json
{
  "cid": 101,
  "cname": "John Doe",
  "cemail": "john@example.com"
}


📁 Output Format (JSON)
{
  "cid": 101,
  "cname": "John Doe",
  "cemail": "john@example.com"
}
