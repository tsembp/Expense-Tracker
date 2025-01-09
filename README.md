# 💵 Expense-Tracker

A simple Expense Tracker project built with Spring Boot and Maven for managing personal expenses.

## Features
- Add new expenses with details.
- View a list of all expenses.

## Technologies Used
- Java      (Spring Boot)
- MySQL     (Database)
- Maven     (Project Management)
- Thymeleaf (UI Template Engine)
- HTML, CSS (Frontend)

## Install Maven
```bash
your\path> cd "ExpenseTracker/project"
your\path\ExpenseTracker\project> mvn clean install
```

# Initiate Local Server (localhost:8080)
```bash
your\path\ExpenseTracker\project> mvn spring-boot:run
```

## Create & Delete using curl in terminal
- Create:
curl -X POST "http://localhost:8080/api/expenses" -H "Content-Type: application/json" -d "{ \"category\": \"Food\", \"amount\": 8.60, \"date\": \"2025-01-07\", \"description\": \"Chick-In Tenders Meal\" }"

- Delete:
curl -X DELETE "http://localhost:8080/api/expenses/{id}"
