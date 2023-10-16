import java.util.Scanner;

public class Assignment2_Day21 {
    public static void main(String[] args) {
       /* 1.Write a method that takes as a parameter int n number from main method passed argument,
        and then it prints n times hello using for loop.
        Expected output: Input: 5, Output: hello, hello, hello, hello, hello  */
        int n = 5;
        printHello(n);
        System.out.println();
        convertToLowerCase("Codewise Chicago");
        convertToLowerCase("THE BEST PLACE TO STUDY");
        calculatePower(2, 6);
        System.out.println();
        calculatePower(3, 4);
        System.out.println();
        text("" + isPrime(17));
        System.out.println();
         text("" + isPrime(15));
    }

    public static void text(String message) {
        System.out.print(message);
    }

    public static void printHello(int n) {
        for (int i = 0; i < n; i++) {
            text("Hello ");
        }
    }
      /* 2.(VOID)Create a method called convertToLowerCase that takes a string as a parameter and prints
    the string converted to lowercase and replaces all 'e' letters to 'a'.
    Expected output:
    Input : Codewise Chicago
    Output : codawisa chicago
    Input : THE BEST PLACE TO STUDY
    Output : tha bast placa to study  */

    public static void convertToLowerCase(String message) {
        System.out.println(message.toLowerCase().replace('e', 'a'));
    }

    /*Task 4:  Medium
     (VOID)Write a Java method called calculatePower that takes two integers as parameters, a base, and an exponent
    and prints the result of base raised to the power of exponent.
    Explanation: for 2 and 6 -> 2*2*2*2*2*2 = 64
    Expected output:
    Input : 2, 6
    Output : 64
    Input : 3, 4
    Output : 81   */

    public static void calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        text("" + result);
    }

    /*Task 5:  Medium
     (RETURN TYPE)Create a method called isPrime that takes an integer as a parameter and returns true
     if the number is prime and false otherwise.
    Expected output:
    Input : 17
    Output : true
    Input : 15
    Output : false */

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
               return false;
            }
        }
        return true;
    }
}

