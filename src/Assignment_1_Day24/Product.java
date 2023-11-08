package Assignment_1_Day24;

public class Product {
    public String name;
    public double price;
    int quantity;

    public Product(String newName, double newPrice, int newQuantity){
        name = newName;
        price = newPrice;
        quantity = newQuantity;
    }
    public Product(String newName, double newPrice){
        name = newName;
        price = newPrice;
        quantity = 1;
    }
    public Product(String newName){
        name = newName;
        price = 0.0;
        quantity = 0;
    }
    public void displayProductInfo(){
        System.out.println(name + " , " + price + " , " + quantity );

    }
}
