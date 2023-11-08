import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment2_Day19 {
    public static void main(String[] args) {
        /*1: Easy
        Iterate over array
         * Create this array int[] array = {1,2,3,4,5};
        Print array as below:
        Output: ? 1 4 3 8 5 ?  */
//        int[] array = {1,2,3,4,5};
//        System.out.print("? ");
//        for (int i =0; i < array.length; i++) {
//            System.out.print(array[i]);
//        }
//        System.out.print(" ?");


          /* 2: Easy
        Write a java program that creates 2 arrays with elements, sort 2 arrays, then test
        their equality and print boolean.
         If your arrays are {1,2,3,22,9,5} and {1,2,3,5,9,22}
        Then Output: TRUE  */
//        int[] array1 = {1, 2, 3, 22, 9, 5};
//        int[] array2 = {1, 2, 3, 5, 9, 22};
//        Arrays.sort(array1);
//        Arrays.sort(array2);
//        boolean areEqual = Arrays.equals(array1, array2);
//        System.out.println("the arrays are equal? " + areEqual);

        /*3: Easy
        Write a program which declares int[] array = {1, 2, 3, 4, 5, 6, 7};
        Then use for loop to print every second number multiplied by 2;
        Output: 1, 4, 3, 8, 5, 12, 7   */
//       int[] array = {1, 2, 3, 4, 5, 6, 7};
//       for (int i = 0; i < array.length; i++) {
//           if ((i + 1) % 2 == 0) {
//                System.out.print(array[i] * 2 + " ");
//            }
//        else{
//                System.out.print(array[i] + " ");
//            }

            /*4: Medium
           Write a program which declares int[] array = {1, 2, 3, 4, 5, 6, 7};
            Then use for loop to print every first number multiplied by 5
           and every second number multiplied by 10;
             Output: 5, 20, 15, 40, 25, 60, 35  */
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.print((array[i] * 5) + ", ");
//            } else {
//                System.out.print((array[i] * 10) + ", ");
//            }
//        }


           /*5: Difficult
           Write a program which declare int[] array = new int[10];
           then generate 2 digit random numbers
          print in the first line evens, in the second odds
          If your random numbers are: 76, 12, 99, 11, 45, 33, 23, 87, 67, 58
          Output:
          Evens: 76, 12, 58
          Odds : 99, 11, 45, 33, 23, 87, 67  */
//        int[] array = new int[10];
//        Random random = new Random();
//        System.out.println("even number");
//        for (int i = 0; i < array.length; i++) {
//           int randomNumber = random.nextInt(100);
//            if (i % 2 == 0) ;
//            array[i] = randomNumber;
//            System.out.print(array[i] + " , ");
//        }
//        System.out.println(" ");
//        System.out.println("odd nunber");
//        for (int i = 0; i < array.length; i++) {
//            int randomNumber = random.nextInt(100);
//            if (i % 2 != 0) ;
//            array[i] = randomNumber;
//            System.out.print(array[i] + " , ");
//        }




           /* 6: Difficult
          Write a program which declares int[] array = new int[10]
          and fill it with random numbers from (1 - 6)
          then print the sum of elements of array but don't count 1's and 2's.
          If your array is {1,2,2,4,3,5,1,3,1,5}
         Output: Sum of elements is 20, 1's and 2's not included */
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) + 1;
        }
        int sum = 0;
        for (int num : array) {
            if (num != 1 && num != 2) {
                sum += num;
            }
        }
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("Sum of elements is " + sum + ", 1's and 2's not included.");
    }

}

