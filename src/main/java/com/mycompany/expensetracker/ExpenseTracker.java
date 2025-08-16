/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expensetracker;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author abdullahalnoman
 */
public class ExpenseTracker {
    
    static ArrayList<Expense> myExpenses = new ArrayList<>();
    
    public static void main (String agrs[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("\n>>>>> Expense Tracker <<<<<\n");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Total Expense");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();
            
            boolean running = true;
            while (running) {
            switch (choice){
                case 1:
                    addExpense(input);
                    break;
                case 2:
                    viewExpense();
                    break;
                case 3:
                    showTotalExpense();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }    
    }
    private static void addExpense(Scanner input){
        System.out.println("Enter description of expense");
        String description = input.nextLine();
        System.out.println("Enter the amount of expense");
        double amount = input.nextDouble();
        System.out.println("Enter the date and month of expense");
        String date = input.nextLine();
        
        Expense anExpense = new Expense(amount, description, date);
                myExpenses.add(anExpense);
                
                System.out.println("Expense added successfully");
    }
    private static void viewExpense(){
        if(myExpenses.isEmpty()){
            System.out.println("No expenses added yet");
        }else{
            for(Expense anExpenses : myExpenses){
            System.out.println(anExpenses);
            }
        }
    }
    private static void showTotalExpense(){
        double total = 0;
        for(Expense anExpense : myExpenses){
            total += anExpense.getAmount();
        }
        System.out.println("Total expense till now : $" +total);
    }
    
}
