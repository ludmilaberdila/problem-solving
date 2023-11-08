package Assignment_2_Day26;

public class BankCustomer {
    /*Task 2:
    Create a Java class called "BankCustomer" with the following instance variables:
    name(String), balance(double), isVIP(boolean), totalCustomers (static int)

    Implement the following methods:
    1. A constructor that takes in the name, balance, and VIP status as parameters and assigns them to the
    appropriate instance variables. It should also increment the value of totalCustomers by 1.
    2. A static method called displayTotalCustomers that prints out totalCustomers registered so far.
    3. An instance method called deposit that takes in an amount as a parameter and adds it to the balance.

    4. An instance method called withdraw that takes in an amount as a parameter and subtracts it from the balance.
    Make sure that customer has enough amount before withdrawal.
   5. An instance method called displayCustomerInfo that prints out the customer's name, balance, and VIP status.
   6. Create another java class called TestBankCustomer with main method.
   In the main method create 4 instances of the BankCustomer class,
   call displayTotalCustomers static method it must print 4.
    7. Make call of deposit and withdraw methods for all of 4 bank customers. */

    String name;
    double balance;
    boolean isVIP;

    static int totalCustomers = 0;

    public BankCustomer(String newName, double newBalance, boolean newisVip){
        name = newName;
        balance = newBalance;
        isVIP = newisVip;
        totalCustomers++;
    }
   static void  displayTotalCustomers(){
       System.out.println(totalCustomers);
   }
    void deposit(double amount){
        balance += amount;
    }
    void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else {
            System.out.println("Sorry " + name+ " not enough balance, you can extract only: $" + balance);
        }
    }
    void displayCustomerInfo(){
        System.out.println("Customer by name: " + name + " has balance of $" + balance + " is a VIP " + isVIP);
    }
}
