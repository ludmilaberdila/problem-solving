package Day31;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        /*Create a HashMap to store fruitName(String) and price(Double).
        Put 10 entries to hashMap
        Call this all methods on hashMap
        put(key, value) - add some entry
        get(key) - returns value of given key
        isEmpty() - return whether map is empty or not
        size() - returns number of entries
        putAll() - combine 2 maps and save
        remove(key) - removes entry
        containsKey(key) - cheks if the specified key present in map
        containsValue(value) - cheks if the specified value present in map
        keySet() - returns Set of keys
        values() - returns List of keys
        replace(key, value) - replaces the entry
        clear() - removes all entries */

        HashMap<String, Double> fruitName = new HashMap<>();
        fruitName.put("Orange", 3.99);
        fruitName.put("Banana", 1.98);
        fruitName.put("Apple", 4.99);
        fruitName.put("Fig", 2.99);
        fruitName.put("Peach", 5.00);
        fruitName.put("Lemon", 3.90);
        fruitName.put("Guava", 9.98);
        fruitName.put("Grape", 6.99);
        fruitName.put("Kiwi", 2.59);
        fruitName.put("Plum", 7.00);

        System.out.println(fruitName);

        fruitName.put("Kiwi", 2.3);

        System.out.println("Price of Mango: " + fruitName.get("Mango"));

        System.out.println("Is the map empty? " + fruitName.isEmpty());

        System.out.println("Number of entries: " + fruitName.size());

        HashMap<String, Double> anotherMap = new HashMap<>();
        anotherMap.put("Papaya", 2.7);
        anotherMap.put("Grapefruit", 1.8);
        fruitName.putAll(anotherMap);

        fruitName.remove("Banana");

        System.out.println("Contains key 'Banana'? " + fruitName.containsKey("Banana"));

        System.out.println("Contains value 3.0? " + fruitName.containsValue(3.0));

        System.out.println("Keys: " + fruitName.keySet());

        System.out.println("Values: " + fruitName.values());

        fruitName.replace("Cherry", 2.8);

        fruitName.clear();

        System.out.println("HashMap after clearing: " + fruitName);
    }
}
