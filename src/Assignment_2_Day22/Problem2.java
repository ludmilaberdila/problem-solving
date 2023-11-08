package Assignment_2_Day22;

import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        /*Task 2:  Easy
        Create a method called sortArray that takes an array of integers as a parameter and prints
        a new array with the elements sorted in ascending order.
          Expected output:
        Input : [5,2,3,9,6,8,7]
        Output : [2,3,5,6,7,8,9]
        Input : [10,90,40,60]
        Output : [10,40,60,90]  */
     int[] numbers = {5,2,3,9,6,8,7};
     sortArray(numbers);
        int[] numbers2 = {10,90,40,60};
        sortArray(numbers2);
    }
     public static void sortArray(int[] arr){
         Arrays.sort(arr);
         int[] num = arr;
         System.out.println("new array sort" + Arrays.toString(num));

    }


}
