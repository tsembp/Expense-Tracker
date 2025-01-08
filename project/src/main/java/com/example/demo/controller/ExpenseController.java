package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/expenses") // set prefix for routes
public class ExpenseController {

    private final ExpenseService expenseService; // use ready methods by JpaRepository

    // Constructor Injection
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // GET all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    // POST - Add a new expense
    @PostMapping
    public Expense addExpense(@RequestBody @Valid Expense expense) {
        return expenseService.saveExpense(expense);
    }

    // GET - Find an expense by ID
    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {
        Optional<Expense> expense = expenseService.getExpenseById(id);
        return expense.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE - Delete an expense by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.ok("Expense deleted successfully.");
    }
}
