package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private Double amount;
    private LocalDate date;
    private String description;

    // ID
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    // Category
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    // Expense Amount
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    // Date
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    // Description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}