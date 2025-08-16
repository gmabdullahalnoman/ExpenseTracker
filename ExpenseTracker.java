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
    private static void addExpense(Scanner input){
        String description = input.nextLine();
        double amount = input.nextDouble();
        String date = input.nextLine();
        
        Expense anExpense = new Expense(amount, description, date);
                myExpenses.add(anExpense);
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
        System.out.println(total);
    }
    
}