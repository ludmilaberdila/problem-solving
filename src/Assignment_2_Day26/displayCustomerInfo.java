package Assignment_2_Day26;

public class displayCustomerInfo {
    public static void main(String[] args) {
     BankCustomer customer1 = new BankCustomer("Mike", 2000,true);
     BankCustomer customer2 = new BankCustomer("Ellen", 5000,true);
     BankCustomer customer3 = new BankCustomer("Alex", 1000, false);
     BankCustomer customer4 = new BankCustomer("Ema", 500,false);

        customer1.displayTotalCustomers();

        customer1.deposit(100);
        customer1.withdraw(200);
        customer1.displayCustomerInfo();

        customer2.deposit(100);
        customer2.withdraw(4000);
        customer2.displayCustomerInfo();

        customer3.deposit(10000);
        customer3.withdraw(6000);
        customer3.displayCustomerInfo();

        customer4.deposit(100);
        customer4.withdraw(650);
        customer4.displayCustomerInfo();

    }
}
