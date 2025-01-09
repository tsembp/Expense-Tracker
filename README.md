# Expense-Tracker

## Initiate Local Server
...\ExpenseTracker\project> mvn spring-boot:run

## Create & Delete using curl in terminal
- Create:
curl -X POST "http://localhost:8080/api/expenses" -H "Content-Type: application/json" -d "{ \"category\": \"Food\", \"amount\": 8.60, \"date\": \"2025-01-07\", \"description\": \"Chick-In Tenders Meal\" }"

- Delete:
curl -X DELETE "http://localhost:8080/api/expenses/1"
