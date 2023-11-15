package Assignment_1_Day39;

public class Electronics extends Product{
    int warrantyPeriod;

    public Electronics(String productId, String productName, double price, int warrantyPeriod) {
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public void displayInfo(){
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price $: " + price);
        System.out.println("Product Warranty Period: " + warrantyPeriod + "months");

    }
}
