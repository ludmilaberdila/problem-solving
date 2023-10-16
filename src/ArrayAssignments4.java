import java.util.Arrays;

public class ArrayAssignments4 {
    public static void main(String[] args) {
               /*Task 1: Easy
               * Create 3 arrays of int with different sizes, names and values.
                  Print elements of all 3 int arrays.
              *Create 3 arrays of short with different sizes, names  and values.
                  Print elements of all 3 short arrays.
               * Create 3 arrays of double with different sizes, names  and values.
                   Print elements of all 3 double arrays.
               * Create 3 arrays of boolean with different sizes, names  and values.
                  Print elements of all 3 boolean arrays.
                * Create 3 arrays of String different sizes, names  and values.
                   Print elements of all 3 String arrays.  */

//    int [] date = {5, 10, 15};
//    int [] yars = {1987, 1990, 2005};
//    int [] month = {1, 2, 4};
//    System.out.print("Print element: " + Arrays.toString(date) + " , " + Arrays.toString(yars)+ " , " + Arrays.toString(month));
//        short [] num1 = {10, 15, 20};
//        int [] num2 = {19, 25, 30};
//        int [] num3 = {1, 2, 4};
//      System.out.println("Print element: " + Arrays.toString(num1) + " , " + Arrays.toString(num2)+ " , " + Arrays.toString(num3));
//           double [] a1 = {5.5, 1.5, 15.8};
//           double [] a2 = {19.7, 10.3, 20.5};
//           double [] a3 = {1.9, 2.5, 4.8};
//           System.out.print("Print element: " + Arrays.toString(a1) + " , " + Arrays.toString(a2)+ " , " + Arrays.toString(a3));
//    boolean [] m1 = {true, false, true};
//    boolean [] m2 = {false, false, true};
//    boolean [] m3 = {true, true, true};
//    System.out.print("Print element: " + Arrays.toString(m1) + " , " + Arrays.toString(m2)+ " , " + Arrays.toString(m3));
//      String [] name = {"Mia"};
//      String [] name2 = {"Abi"};
//      String [] name3 = {"Lilut"};
//      System.out.print("Print element: " + Arrays.toString(name) + " , " + Arrays.toString(name2)+ " , " + Arrays.toString(name3));


//       /* Task 2: Easy
//        Given below array of ints, write a program to print array elements in reversed order.
//        int [] array = {1, 99, 0, -5, 12, 543, -123, 234, 98};
//        Expected output: 98, 234, -123, 543, 12, -5, 0, 99, 1  */
//        int[] numbers = {1, 99, 0, -5, 12, 543, -123, 234, 98};
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println( numbers[i]);}
//

        /* Task 3:  Difficult
        Given below array of ints, write a program to sum values of array and print this sum.
        Hint: use loop or manually one by one
        int [] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Expected output:The sum of given ints is: 55    */
//        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int i = 0; i < my_array.length; i++) {
//            sum += my_array[i];
//        }
//        System.out.println("The sum of given ints is: " + sum);


       /* Given below array of ints, write a program to find average value of array elements. Hint: use loop or manually one by one
        int [] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        Expected output:The average value of given ints is: 18 */
        int[] averValues = {3, 6, 8, 10, 90, 0, 25, 2, 32, 11};
        int sum = 0;
        for (int i = 0; i < averValues.length; i++) {
            sum += averValues[i];
        }
        System.out.println(sum / averValues.length);
    }
}

