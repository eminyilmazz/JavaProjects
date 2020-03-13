package Email;

import java.util.Random;
public class Email {
    Random random = new Random();
    private String name, lastName, department, address, password;
    private int mailboxCapacity = 100;
    private int defaultPassLength = 8;
    public String getName() { return name; }
    public String getLastName() { return lastName; }
    public String getDepartment() { return department; }
    public String getAddress() { return address; }
    public void setPassword(String password) { this.password = password; }
    public void setMailboxCapacity(int mailboxCapacity) { this.mailboxCapacity = mailboxCapacity; }
    public String getPassword() { return password; }
    public int getMailboxCapacity() { return mailboxCapacity; }

    public Email(String name, String lastName, int departmentNo) {
        this.name = name;
        this.lastName = lastName;
        switch (departmentNo) {
            case 0 : this.department = "";
                break;
            case 1 : this.department = "sale";
                break;
            case 2 : this.department = "dev";
                break;
            case 3 : this.department = "acct";
                break; }
        this.address = emailAddressGenerator();
        this.password = passGenerator(defaultPassLength); }
    public String emailAddressGenerator() { return this.name + "." + this.lastName + "@" + this.department +  ".company.com"; }

    public String passGenerator(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand); }
        return new String(password); }
}