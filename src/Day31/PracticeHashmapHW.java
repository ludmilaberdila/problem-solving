package Day31;

import java.util.HashMap;
import java.util.HashSet;

public class PracticeHashmapHW {
    public static void main(String[] args) {
        /*Create a hashmap to store name(string) and price(double) of phones.
        Add 5 phones and their prices to the hashmap.
        Print the size of hashmap.
        Iterate over the hashmap and print only phone names.
        Iterate over the hashmap and print only the prices of phones
        Check if there any “iPhone 13” in hashmap.
        If yes, change its price to 500. If no add iPhone 13 with price 500.
        Remove all phones
        Check and print if hashmap in empty. */
        HashMap<String, Double> phone = new HashMap<>();

        phone.put("iPhone X", 999.99);
        phone.put("Samsung Galaxy S21", 799.99);
        phone.put("Google Pixel 6", 899.99);
        phone.put("OnePlus 9 Pro", 749.99);
        phone.put("Xiaomi Mi 11", 699.99);

        int size = phone.size();
        System.out.println("Size of the HashMap: " + size);

        for (String phoneName : phone.keySet()) {
            System.out.println("Phone Name: " + phoneName);
        }

        for (Double price : phone.values()) {
            System.out.println("Phone Price is: " + price);
        }

        if(phone.containsKey("iPhone 13")){
            phone.put("iPhone 13", 500.0);
        }
        else {
            phone.put("iPhone 13", 500.0);
        }

        phone.clear();
        System.out.println(phone);




    }
}
