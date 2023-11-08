package Assignment_2_Day28;
/*Create PracticeArrayListHW4 java class and do the following tasks:

        1. Create an ArrayList of integers and add 10 random numbers in this range (10,50)
        to it using Random and for loop.
        Calculate and print the sum of all the numbers in the list.

        2. Create an ArrayList of doubles and add 8 random numbers to it using Random and for loop.
        Calculate and print the average of all the values in the list.

        3. Create an ArrayList of strings and add 7 country names to it.
        Sort the list in alphabetical order and print the sorted list.

        4. Create an ArrayList of integers and add 10 elements to it.
        Remove all the even numbers from the list and print it.  */
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class PracticeArrayListHW4 {

    public static void main(String[] args) {
        Random random = new Random();
//        ArrayList<Integer> integers = new ArrayList<>();
//        int randomNumber;
//        int total = 0;
//        for (int i = 0; i < 10; i++) {
//            randomNumber = random.nextInt(10, 50);
//            integers.add(randomNumber);
//            total = total + randomNumber;
//        }
//        System.out.println(integers);
//        System.out.println(total);
//        System.out.println("------------------------------------------------");



        ArrayList<Double> numberList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            double randomNumber = random.nextDouble() * 100;
            numberList.add(randomNumber);
        }
        double sum = 0.0;
        for (double num : numberList) {
            sum += num;
        }
        double average = sum / numberList.size();
        System.out.println("Random Numbers in the List: " + numberList);
        System.out.println("Average of the numbers: " + average);
        System.out.println("------------------------------------------------");



        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("USA");
        countryList.add("Macedonia");
        countryList.add("Romania");
        countryList.add("Canada");
        countryList.add("Italy");
        countryList.add("Germany");
        countryList.add("Poland");
        Collections.sort(countryList);
        System.out.println("Sorted Country Names:");
        for (String country : countryList) {
            System.out.println(country);
        }
        System.out.println("------------------------------------------------");

        ArrayList<Integer> evanNumber = new ArrayList<>();
        evanNumber.add(2);
        evanNumber.add(7);
        evanNumber.add(14);
        evanNumber.add(9);
        evanNumber.add(6);
        evanNumber.add(18);
        evanNumber.add(5);
        evanNumber.add(12);
        evanNumber.add(3);
        evanNumber.add(11);
        evanNumber.removeIf(num -> num % 2 == 0);
        System.out.println("List after removing even numbers:" +  evanNumber);

    }
}
