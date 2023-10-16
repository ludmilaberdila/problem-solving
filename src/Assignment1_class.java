import java.util.Scanner;

public class Assignment1_class {
    public static void main(String[] args) {
            /* 1: Easy
              Write a program which prints the text below using nested loops.
                Output:
                    ***
                    ****
                    *****
                    ******
                    *******        */
        for (int i = 3; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


       /* Write a program which prints the rectangle below using nested loops.
                First you need to enter some int number using Scanner.
        Input: 8
        Output:
        88888888
        88888888
        88888888
        88888888
        88888888
        88888888
        88888888
        88888888   */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number; j++) {
//                System.out.print(number);
//            }
//            System.out.println();
//        }


       /* 1. Write a program that asks a user to enter 2 int numbers
        then declare this array int[] array = new int[10]
        and fill it with random numbers between 20-100.
        2. Then enter 2 int numbers using scanner
        3. If arrays contains those 2 int number then print true otherwise false
        If your array is gonna be {23,55,91,25,76,34,98,77,15,43}
        Input: 25
        Input: 43
        print: true
        Input: 39
        Input: 23
        print: false  */
    }
}
