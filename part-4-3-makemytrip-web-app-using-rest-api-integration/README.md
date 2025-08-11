# MakeMyTripApp - Spring Boot REST API Integration Project

This is a web-based Spring Boot project that simulates a basic travel booking interface, similar to MakeMyTrip. The application consumes an external REST API (IRCTC Ticket Booking API) using Spring's `RestTemplate`. Users can submit passenger details and view booked tickets through a user-friendly Thymeleaf interface.

---

## 🚀 Features

- 🧾 Book tickets by submitting passenger details via a web form
- 🔄 Interact with an external API to submit and fetch ticket data
- 📃 Display all booked tickets in a tabular format
- 🎨 Frontend UI styled with Bootstrap
- 📡 Uses `RestTemplate` for REST API calls

---

## 📦 Tech Stack

- Java 21
- Spring Boot
- Spring MVC
- Thymeleaf
- RestTemplate
- Bootstrap 5
- Maven

---

## 📂 Project Structure

22-MakeMyTripApp/
├── controller/
│ └── TicketController.java
├── model/
│ ├── Passenger.java
│ └── Ticket.java
├── templates/
│ ├── index.html
│ └── tickets.html
├── application.properties
└── MakeMyTripAppApplication.java

yaml


---

## 🔗 API Integration Details

- **POST `/ticket`** – Book a ticket by sending passenger details as JSON  
- **GET `/tickets`** – Retrieve all booked tickets

These endpoints are consumed from the external IRCTC REST API project running independently.

---

## ✅ How It Works

1. User visits the homepage (`/`)
2. Fills out the booking form and submits
3. Form data is sent to the IRCTC service via `RestTemplate.postForEntity()`
4. Ticket response is displayed on a confirmation page
5. All booked tickets can be viewed via `RestTemplate.getForEntity()`


```bash
# Run the application
./mvnw spring-boot:run
Visit: http://localhost:8080