package Assignment_1_Day39;

public class Main {
    public static void main(String[] args) {
    /*Create a Main class with a main method to simulate the following actions:
    Create instances of Electronics and Clothing products using constructor with parameters .
    Display the information of the products using the displayInfo() method.
    Update values of Electronics object and Clothing object for their attributes using encapsulation.
    Display the information of the products using the displayInfo() method. */

        Electronics electronic = new Electronics("ApB", "Sony", 45.99, 12);
        Clothing clothing = new Clothing("ahVB", "Dress", 99.99, "Small");

        System.out.println("electronic product: ");
        electronic.displayInfo();

        System.out.println("Clothing info description: ");
        clothing.displayInfo();

        electronic.setPrice(79.99);
        clothing.setPrice(144.99);
        clothing.setSize("medium");

        System.out.println("Update info: ");
        electronic.displayInfo();
        clothing.displayInfo();
    }
}
