package Assignment_1_Day24;

public class TestProduct {
    public static void main(String[] args) {


   /* Task 1:
    Create a Java class called "Product" with the following instance variables:
    name (String), price (double), quantity (int)
    Create the following constructors:
   1. A constructor that takes in all three instance variables as parameters
    and assigns them to the appropriate instance variables.

   2. A constructor that takes in only the name and price as parameters
   and assigns them to the appropriate instance variables, constructor should set quantity to 1.

    3. A constructor that takes in only the name as a parameter and assigns it to the
    appropriate instance variable, constructor should set the price to 0.0 and the quantity to 0.

    4. Additionally, create a method called displayProductInfo that prints the name, price,
     and quantity of the product.
    Create a separate Java class called TestProduct with a main method.
     In the main method, create 3 instances of the Product class using different constructors,
     and call the displayProductInfo method on each instance to print out their information
    */

        Product p1 = new Product("bread" , 23.5, 10);

        Product p2 = new Product("milk", 12.4);

        Product p3 = new Product("soup");

        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();


    }
}
