package Assignment_2_Day22;

public class Problem1 {
    public static void main(String[] args) {
        /*Task 1:  Easy
        Create a method called calculateDiscount that takes int original price and int discountPercentage
        as parameters and returns the final price after applying the discount.
         Create main method and call it there.
        Expected output:
        Input : 1000
        Input : 10
        Output : 900
        Input : 1200
        Input : 10
        Output : 1080  */
       // int price = 1200;
        int price =1000;
        int discount = 10;
        int finalPrice = calculateDiscount(price, discount);
        System.out.print("Final Price after applying discount: " + price+ " " + discount + " " + finalPrice);
    }
     public static int calculateDiscount(int price, int discount){
         double discountAmount = (price * discount) / 100.0;
         int finalPrice = price - (int) discountAmount;
         return finalPrice;
     }


}
