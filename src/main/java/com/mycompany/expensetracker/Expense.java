/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expensetracker;

/**
 *
 * @author abdullahalnoman
 */
public class Expense {
    
    String description;
    double amount;
    String date;
    
    public Expense ( double amount, String description, String date){
        
        this.amount = amount;
        this.description = description;
        this.date = date;
        
    }
    
    public double getAmount(){
        return amount;    
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getDate(){
        return date;
    }
    @Override
    public String toString() {
        return date + " of 2025 " + " | " + description + " | $" + amount;
        // Overriding a superclass method
    }
}
