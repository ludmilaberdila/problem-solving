package Assignmnt_1_Day26;

public class Product {
    /*Task 1:
    Create a Java class called "Product" with the following instance variables:
    name (String)
    price (double)
    quantity (int)
    totalProductsSold (static int)

    Implement the following :
    1. A constructor that takes in the name, price, and quantity as parameters
     and assigns them to the appropriate instance variables.
     It should also increment the value of totalProductsSold by 1.
    2. A static method called displayTotalProductsSold that prints out the total number of products sold so far.
    3. An instance method called calculateTotalValue that calculates and prints the total value of the product
     (price multiplied by quantity).
     4. An instance method called displayProductInfo that prints out the name, price, quantity,
     and total value of the product which is quantity * price.
    5. Create another java class called TestProduct with main method and in main method
     create 6 instances of the Product class with values,
     call displayTotalProductsSold() it must print 6 products sold.
     6. Call calculateTotalValue on 6 instances, so that it prints cost of products.  */

    String name;
    double price;
    int quantity;

    static int totalProductsSold = 0;

    public Product(String newName, double newPrice, int newQuantity){
        name = newName;
        price = newPrice;
        quantity = newQuantity;
        totalProductsSold++;
    }
    public void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public void sum(int masa, int dracu){
        System.out.println(masa + dracu );
    }
    static void displayTotalProductsSold(){
        System.out.println(totalProductsSold + " products sold.");
    }

    void calculateTotalValue(){
        System.out.println("Total value for " + name + " is: " + price * quantity);
    }
    void displayProductInfo(){
        System.out.println( "Product \"" + name + "\" at price: " + price + "$ of a quantity: " +
                quantity + " evaluates to total value: " + (quantity * price) + "$");
        sum(4, 5);
        sum(5, 7, 8);
    }
}
