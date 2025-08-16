/**
 *
 * @author abdullahalnoman
 */
//Declares a public class named Expense. 
    //This is our model : one object = one expense record. 
    
    
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
        return date + " | " + description + " | $" + amount;
        // toString() method to display expense details
    }
}