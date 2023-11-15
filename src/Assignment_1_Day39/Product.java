package Assignment_1_Day39;

abstract class Product {
    String productId;
    String productName;
    double price;

    public Product(String productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    abstract void displayInfo(); //abstract method

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
