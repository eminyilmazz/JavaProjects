package Email;

import java.util.Scanner;
public class EmailApp {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Enter your first name: ");
        String name = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Departments: \n01: Sales\n02: Development\n03: Accounting\n" +
                        "Choose your department: ");
        int departmentNo = input.nextInt();
        do {
            if (departmentNo <= 3 && departmentNo >= 0) { break; }
            System.out.println("Incorrect input. Try again: ");
            departmentNo = input.nextInt();
        } while(true);
        Email emailAddress = new Email(name, lastName, departmentNo);
        System.out.println(emailAddress.getName() + " " + emailAddress.getLastName() + "\n" + emailAddress.getDepartment() +
                           "\n" + emailAddress.getAddress() + "\n" + emailAddress.getPassword()); }
}
