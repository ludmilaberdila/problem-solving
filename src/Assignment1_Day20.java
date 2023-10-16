import java.util.Random;
import java.util.Scanner;

public class Assignment1_Day20 {
    public static void main(String[] args) {
       /* 1: Easy
        Write a program which prints the text below using nested loops.
          Output:
          ***
          ****
          *****
          ******
          *******   */
//        for (int i = 3; i <= 7; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /* 2: Easy
         Write a program which prints the rectangle below using nested loops.
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
        88888888  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number : ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number; j++) {
//                System.out.print(number);
//            }
//            System.out.println();
//        }

        /*3. Write a program that asks a user to enter 2 int numbers
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
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20,100);
//        }
//        System.out.print("Enter the first integer: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter the second integer: ");
//        int num2 = scanner.nextInt();
//        boolean containsNum1 = false;
//        boolean containsNum2 = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == num1) {
//                containsNum1 = true;
//            }
//            if (array[i] == num2) {
//                containsNum2 = true;
//            }
//        }
//        if (containsNum1 && containsNum2) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        /* 4: Medium
        Create a program where it prompts the user to enter 7 numbers and stores them in the array
        Imagine you want to track your weekly expenses.
        Create a Java program that allows you to input your daily expenses for a week.
        It should print the total weekly expense.
                It should print the average spent every day.
                Input:20  */
        Scanner scanner = new Scanner(System.in);
        double[] dailyExpenses = new double[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            dailyExpenses[i] = scanner.nextDouble();
        }
        double totalExpense = 0;
        for (double expense : dailyExpenses) {
            totalExpense += expense;
        }
        double averageExpense = totalExpense / 7;
        System.out.println("Total weekly expense: $" + totalExpense);
        System.out.println("Average spent every day: $" + averageExpense);



    }
}
