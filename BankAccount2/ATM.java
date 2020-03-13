package BankAccount2;

import java.util.Scanner;


public class ATM {
    
    public void run(Account account) {
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our bank....");
        
        System.out.println("****************************");
        System.out.println("User login");
        System.out.println("****************************");
        int loginAttempts = 3;
        
        while (true) {
            if (login.login(account)) {
                System.out.println("Giriş Başarılı...");
                break;
                
                
            }
            else {
                System.out.println("Giriş Başarısız...");
                loginAttempts -= 1;
                System.out.println("Kalan Giriş Hakkı : " + loginAttempts);
            }
            if (loginAttempts == 0 ){
                System.out.println("Giriş Hakkınız Bitti...");
                
                return;
                
            }
             
            
            
        }
        
        System.out.println("*********************************");
        String actions = "1. Display balance\n"
                          + "2. Deposit\n"
                          + "3. Withdraw\n"
                          + "Press 'q' quit" ;
        System.out.println(actions);
        System.out.println("**********************************");
        
        
        while (true) {
            System.out.println("Choose action : ");
            String chosenAction = scanner.nextLine();
            
            if (chosenAction.equals("q")){
                
                break;
                
            }
            else if (chosenAction.equals("1")){
                System.out.println("Balance : " + account.getBalance());
            }
            else if (chosenAction.equals("2")){
                
                System.out.print("The amount you want to deposit : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.deposit(tutar);
                
            }
            else if (chosenAction.equals("3")) {
                
                System.out.print("The amount you want to deposit : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(tutar);
                
            }
            else {
                
                System.out.println("Incorrect input....");
            }
            
            
            
        }
    }
    
}
