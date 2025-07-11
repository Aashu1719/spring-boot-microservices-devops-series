# 🧩 Microservices Project – Service Registry | Admin Server | Welcome & Greet APIs | API Gateway

This is a **complete microservices architecture project** developed using Spring Boot, Spring Cloud, Eureka, Feign, Spring Boot Admin, and Spring Cloud Gateway. It demonstrates real-world service communication, monitoring, and dynamic routing through an API Gateway.

---

## 🏗️ Project Modules

| Module Name           | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| `28-serviceRegistry`   | Eureka server to register and discover microservices                        |
| `29-adminServer`       | Spring Boot Admin UI to monitor services, view metrics, and logs            |
| `30-WelcomeApi`        | A basic REST API that returns a welcome message                             |
| `31-GreetApi`          | Uses Feign client to call Welcome API and returns a composed greet message  |
| `32-APIGateway`        | Spring Cloud Gateway that routes client requests to respective services     |

---

## ⚙️ Tech Stack

- **Java 21**
- **Spring Boot 3.x**
- **Spring Cloud (Eureka, Gateway, OpenFeign)**
- **Spring Boot Admin (Codecentric)**
- **Maven**
- **IntelliJ / VSCode**
- **Actuator + Monitoring**
- **YAML Configuration**

---

## 🔗 Service Overview

### ✅ 28 - Service Registry

- Eureka Server  
- Port: `8761`  
- Discovers and manages all other services

```yaml
server:
  port: 8761

eureka:
  client:
    register-with-eureka: false


✅ 29 - Admin Server
Monitors registered services via UI

Port: 9090

Auto-discovers services using actuator endpoints

yaml
Copy
Edit
server:
  port: 9090
✅ 30 - Welcome API
Returns: "Welcome to Ashok It (port)"

Port: dynamically set

Registers with Eureka and Admin Server

yaml
Copy
Edit
spring:
  application:
    name: WELCOME-API
  boot:
    admin.client.url: http://localhost:9090
✅ 31 - Greet API
Uses Feign Client to call Welcome API

Returns: "Good morning!Welcome to Ashok It (port)"

Port: 8085

Registers with Eureka & Admin Server

yaml
Copy
Edit
spring:
  application:
    name: GREET-API
  boot:
    admin.client.url: http://localhost:9090
✅ 32 - API Gateway
Routes:

/welcome → Welcome API

/greet → Greet API

Port: 3333

Includes a global AppFilter to log headers and modify response

yaml
Copy
Edit
spring:
  cloud:
    gateway:
      routes:
        - id: welcome-api
          uri: lb://WELCOME-API
          predicates:
            - Path=/welcome
        - id: greet-api
          uri: lb://GREET-API
          predicates:
            - Path=/greet
🔄 Service Flow
rust
Copy
Edit
Client
  |
  |---> API Gateway (/welcome) --------------> Welcome API → Response
  |
  |---> API Gateway (/greet) ----------------> Greet API
                                       |
                                       |-- Feign --> Welcome API
🧪 How to Test
Start Eureka (serviceRegistry) → localhost:8761

Start Admin Server → localhost:9090

Start Welcome API → check /welcome response

Start Greet API → check /greet response (combines both)

Start API Gateway → test routes:

http://localhost:3333/welcome

http://localhost:3333/greet