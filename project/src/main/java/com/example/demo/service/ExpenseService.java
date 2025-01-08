package com.example.demo.service;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository; // use ready CRUD methods by JpaRepository

    // Constructor Injection
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    // Fetch all expenses
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    // Save a new expense
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    // Find an expense by ID
    public Optional<Expense> getExpenseById(Long id) {
        return expenseRepository.findById(id);
    }

    // Delete an expense by ID
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}