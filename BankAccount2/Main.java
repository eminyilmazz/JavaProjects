package BankAccount2;

public class Main {
    public static void main(String[] args) {
        // Object Oriented ATM
        
        // Login Class checks user login.
        
        // Account Class does account operations
        
        // ATM runs ATM
        
        ATM atm = new ATM();
        
        Account account = new Account("name","12345", 2000);
        
        atm.run(account);
        System.out.println("Closing...");
        
        
        
        
    }
 
}
