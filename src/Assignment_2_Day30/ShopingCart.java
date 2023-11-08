package Assignment_2_Day30;

import java.util.ArrayList;

public class ShopingCart {
    ArrayList<Product> cart = new ArrayList<Product>();

    public void add(Product product) {
        cart.add(product);
    }

    public void displayProducts() {
        for (Product product : cart) {
            System.out.println(product.name);
        }
    }

    public void calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : cart) {
            totalPrice += (product.price * product.quantity);
        }
        System.out.println(totalPrice);
    }

    public void removeProduct(Product product) {
        String productName = product.name;
        cart.remove(product);
        System.out.println("You removed " + productName + " from your cart. ");
    }
}

