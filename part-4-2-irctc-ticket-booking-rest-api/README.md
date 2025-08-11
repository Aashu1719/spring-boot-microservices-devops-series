# 21-sb-rest-irctc-app

This Spring Boot REST API project simulates a simplified version of an IRCTC ticket booking service. It allows users to book train tickets and fetch all booked tickets using REST endpoints.

## ✨ Features Implemented

- Accepts passenger details and books a ticket
- Generates a random ticket number and marks it as "Confirmed"
- Stores booked tickets in a simulated in-memory database
- Provides an endpoint to fetch all booked tickets

## 🧩 Endpoints

### 1. Book a Ticket

POST /ticket
Content-Type: application/json


**Request Body:**

json
{
  "name": "Ravi Kumar",
  "email": "ravi@example.com",
  "from": "Delhi",
  "to": "Mumbai",
  "doj": "2025-08-15",
  "trainNum": "12345"
}

Response:

json
Copy
Edit
{
  "ticketNum": 3,
  "name": "Ravi Kumar",
  "email": "ravi@example.com",
  "from": "Delhi",
  "to": "Mumbai",
  "doj": "2025-08-15",
  "trainNum": "12345",
  "status": "Confirmed"
}


2. Fetch All Tickets

Response:

Returns an array of all booked tickets.

🧠 Technologies Used
Java 21
Spring Boot
Spring Web (REST)
Maven
Lombok

