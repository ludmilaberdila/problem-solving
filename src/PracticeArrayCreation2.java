import java.util.Arrays;
import java.util.Scanner;

public class PracticeArrayCreation2 {
    public static void main(String[] args) {
        /*Task 1: Declare and Initialize an Array of Integers
         Declare an array to hold 5 integers.
         Initialize it with the values 5, 10, 15, 20, 25.
         Print all elements of the array to the console. */

//       int [] number = {5,10,15,20,25};
//       for( int i =0; i< number.length; i++){
//           System.out.println(number[i]);
//        }

       /* Task 2: Modify Values of an Array
        Declare and initialize an array of integers with the values 1, 2, 3, 4, 5.
        Change the value at the 2nd index to 7.
        Print all the elements of the modified array. */
//        int[] numbers = {1, 2, 3, 4, 5};
//        numbers[2] = 7;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

      /*  Task 3: Declare an Array with User Input
        Ask the user to enter the size of an array.
        Declare an array of that size.
        Print the array to the console.
        Print the size of array to the console. */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the size of one array");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("array: " + Arrays.toString(array) + " size of array: " + array.length);

        /*Task 4: Sort an Array
        Declare and initialize an int array with values {1000, 1, 934, 23, -5, 500}
        Use the Arrays.sort() method to sort the array.
                Print the sorted array to the console. */
//        int day [] = {1000, 1, 934, 23, -5, 500};
//        Arrays.sort(day);
//        System.out.println("array sort" + Arrays.toString(day));

       /* Task 5: Check if Two Arrays are Equal
          Declare and initialize two arrays of doubles with the same values but in a different order.
          Sort both arrays using Arrays.sort().
                Use the Arrays.equals() method to check if the two arrays are equal after sorting.
                Print the result of the comparison.  */
//    double number [] = {2.4, 4.2};
//    double number2 [] = {4.2, 2.4};
//    Arrays.sort(number);
//    Arrays.sort(number2);
//        System.out.println("result comparing" + Arrays.toString(number) + " , "  +  Arrays.toString(number2) + Arrays.equals(number, number2));

        /*Task 6: Clone an Array
         Declare and initialize an int[] array1 with values {1,2,3,4,5}
         Declare and initialize an int[] array2
         Use the Arrays.clone() method to clone the array1 into array2.
         Print both the original and the cloned arrays to verify the copy.  */
//        int[] array1 = {1,2,3,4,5};
//        int[] array2 =array1.clone();
//        System.out.println("Cloned arrays: " + Arrays.toString(array1) + " , " + Arrays.toString(array2));

        /* Task 7: Sort and Compare String Arrays
        Declare and initialize two arrays of strings with the same words but in a different order.
        Sort both arrays using Arrays.sort().
        Use Arrays.equals() to compare the sorted arrays. Print the result of the comparison.
        Remember, Arrays.sort() sorts the array in-place, Arrays.equals() checks if two arrays are equal
        in terms of sequence and content, and Arrays.clone() makes a new array that is a copy of an existing one.
         */
//        String[] name1 = {"apple", "banana", "orange"};
//        String[] name2 = {"orange", "apple", "banana"};
//        Arrays.sort(name1);
//        Arrays.sort(name2);
//        System.out.println("Print the result of the comparison: " + Arrays.toString(name1) + " , " + Arrays.toString(name2) + " , " + Arrays.equals(name1, name2));
    }
}
