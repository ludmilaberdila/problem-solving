import java.util.Scanner;

public class Day6Scanner {
    public static void main(String[] args) {

       /* Task 1: Write a Java program that accepts two integers from the user and:
        1) prints the sum
        2) print the the difference
        3) prints the product
        4) print their average
        Expected output:
        Input 1st integer: 25
        Input 2nd integer: 5
        Expected Output :
        Sum of two integers: 30
        Difference of two integers: 20
        Product of two integers: 125
        Average of two integers: 15.0  */

     /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integer number : ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second number : ");
        int number2 = scanner.nextInt();
        System.out.println("Sum of two integers : " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println("Difference of two integers : " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("Product of two integers : " + number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println("Average of two integers : " + " = " + (number1 + number2) / 2.0); */


       /* Task 2.
       Problem: Write a program that asks the user to enter two numbers. Print the sum of the numbers. */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number : ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your second number : ");
        int number2 = scanner.nextInt();
        System.out.println("Sum of two integers : " + number1 + " + " + number2 + " = " + (number1 + number2)); */


        /* Problem: Write a program that asks the user to enter their age - means your age.
        And prints your age doubled.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int user_age = scanner.nextInt();
        System.out.println("Hi, your age is : " + (user_age * 2));

        /*Problem: Write a program that asks the user to enter three numbers.
        Calculate and print the average of the three numbers. */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 number : ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double average = (n1+n2+n3)/3;
        System.out.println("Average of : " + n1 + " and " + n2 + "and" + n3 + " is " + average); */

       /* Problem: Write a program that asks the user to enter their name.
          Print a message saying "Hello , name" followed by their name. */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String user_name = scanner.nextLine();
        System.out.println("Hello : " + user_name); */




    }
}
