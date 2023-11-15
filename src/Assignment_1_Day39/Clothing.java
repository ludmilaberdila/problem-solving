package Assignment_1_Day39;

public class Clothing extends Product{
    String size;
    public Clothing(String productId, String productName, double price, String size) {
        super(productId, productName, price);
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
    this.size = size;
    }
    public void displayInfo(){
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price $: " + price);
        System.out.println("Prosuct size: " + size);
    }
}
