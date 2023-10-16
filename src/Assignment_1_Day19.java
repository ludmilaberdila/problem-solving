import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Assignment_1_Day19 {
    public static void main(String[] args) {
       /* 1: Easy
        Write a program which declares String[] string = new String[10];
        Then fill your array using for loop with "HI" and print your array's values;
        Output: ["HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI"]  */
//        String[] string = new String[10];
//        for (int i = 0; i < 10; i++) {
//            string[i] = "HI";
//        }
//        System.out.println(Arrays.toString(string));

       /* 2: Medium
        Write a program which creates an int[] array = new int[10];
        and then enter numbers using scanner and for loop.
         Print how many times 5 is occurred in an array;
        Input: 1
        Input: 23
        Input: 93
        Input: 99
        Input: 5
        Input: 343
        Input: 9
        Input: 5
        Input: 32
        Input: 5
        Output: 5 occurred 3 times  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 10 numbers:");
//        int[] array = new int[10];
//        int number = 0;
//       for( int i =0; i<10; i++ ){
//         array[i] = scanner.nextInt();
//         if (array[i] == 5);
//         number++;
//           }
//        System.out.println(" 5 Occurred: " + number + " times.");
//    }

        /*3:  Medium
        Given below array of ints, write a program to find and prints the largest value of array elements.
        int [] values = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        Expected output: The largest value of given ints is: 90  */
//        int[] values = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
//        int max = values[0];
//        for (int i = 0; i < 10; i++) {
//            if (max < values[i]) {
//                max = values[i];
//            }
//        }
//        System.out.println("The largest value of given ints is: " + max);


        /*4:  Medium
        Given below array of ints, write a program to find and prints the smallest value of array elements.
        int [] values = {3, 6,-3, 8, 10, 90, 0,-1, 25, 2, 32,-22, 11};
        Expected output: The smallest value of given ints is: -22 */
//        int [] values = {3, 6,-3, 8, 10, 90, 0,-1, 25, 2, 32,-22, 11};
//       int small = values[0];
//       for (int i =0; i < values.length; i++ ){
//           if (small > values[i]){
//               small = values[i];
//           }
//       }
//        System.out.println("The smallest value of given ints is: " + small);
//    }

        /*5:  Difficult
        Given below array of ints, write a program that creates new array
        with elements of given array in reversed order and prints it.
        Note: in this task you are not allowed to use Arrays.sort and Collections.reverseOrder methods
        int [] values = {1,2,3,4,5};
        Expected output: 5 4 3 2 1   */

//        int[] values = {1, 2, 3, 4, 5};
//        for (int i = values.length - 1; i >= 0; i--) {
//            System.out.print(" " + values[i]);
//        }

       /* 6: Difficult
        Write a program which declares int[] array = new int[20]
        and fills it with random numbers from (0 to 100)
        print in the first line numbers less than 50
        print in the second line numbers greater than 50 or equal to  */

        int[] array = new int[20];
        int counterLess50 = 0, counterGreater50 = 0;
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            int randomNumber = random.nextInt(100);
            if(randomNumber < 50){
                counterLess50++;
            }
            else{
                counterGreater50++;
            }
            array[i] = randomNumber;
        }
        System.out.println(Arrays.toString(array));
        int[] numbersLess50 = new int[counterLess50];
        int[] numbersGreater50 = new int[counterGreater50];

        int j = 0;
        int k = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 50){
                numbersLess50[j] = array[i];
                j++;
            }
            else{
                numbersGreater50[k] = array[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(numbersLess50));
        System.out.println(Arrays.toString(numbersGreater50));
    }
}
