package Assignment_2_Day30;

public class ShoppingMain {
    public static void main(String[] args) {
        /*Shopping Cart:
        1. Create a Product class with instance variables: name, price, and quantity,
        create its constructor with all variables in parameters.
        2. Create a ShoppingCart class with instance variable:
        ArrayList<Product> cart to store products added by the user.
        3. The ShoppingCar must have a methods that allow:
        adding products to the cart - public void add(Product)
          displaying the cart products - public void displayProducts()
        calculating the total price - public void calculateTotalPrice()
        (OPTIONAL method)removing products from the cart.

        4. Create a ShoppingMain class with main method
        * Create 4 products objects
        * Create 1 ShoppingCart object
        * Add all your products to your shoppingCart objects cart - using addProduct(Product product)
          * Call methods displayCart(), calculatePrice() on shoppingCart object  */

    Product p1 = new Product("Milk", 2.99,1);
    Product p2 = new Product("Orange", 4.99, 2);
    Product p3 = new Product("Juice", 4, 2);
    Product p4 = new Product("Cake", 19.99, 1);

    ShopingCart cart = new ShopingCart();
    cart.add(p1);
    cart.add(p2);
    cart.add(p3);
    cart.add(p4);

    cart.displayProducts();
    cart.calculateTotalPrice();
    cart.removeProduct(p4);
    cart.displayProducts();
    cart.calculateTotalPrice();


    }
}
