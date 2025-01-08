package com.example.demo.controller;

import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class FrontendController {

    private final ExpenseService expenseService;

    public FrontendController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        return "index";
    }

    @PostMapping("/addExpense")
    public String addExpense(
            @RequestParam String category,
            @RequestParam Double amount,
            @RequestParam String date,
            @RequestParam String description
    ) {
        Expense expense = new Expense();
        expense.setCategory(category);
        expense.setAmount(amount);
        expense.setDate(LocalDate.parse(date));
        expense.setDescription(description);

        expenseService.saveExpense(expense);
        return "redirect:/";
    }
}
