package Assignmnt_1_Day26;


public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product("bread" , 23.5, 10);
        Product p2 = new Product("milk", 12.4, 4);
        Product p3 = new Product("soup", 22.4, 22);
        Product p4 = new Product("frits", 7.5, 11);
        Product p5 = new Product("orange", 32.4, 40);
        Product p6 = new Product("banana", 8.6, 33);

        p1.displayTotalProductsSold();

        p1.calculateTotalValue();
        p1.displayProductInfo();

        p2.calculateTotalValue();
        p2.displayProductInfo();

        p3.calculateTotalValue();
        p3.displayProductInfo();

        p4.calculateTotalValue();
        p4.displayProductInfo();

        p5.calculateTotalValue();
        p5.displayProductInfo();

        p6.calculateTotalValue();
        p6.displayProductInfo();
    }
}
