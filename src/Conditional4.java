import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Conditional4 {
    public static void main(String[] args) {
     /*   1) Write a program that accepts two numbers from the user, the first
        of which is the number of students in the class, and the second is the number of
        chairs in the classroom. The program must check whether all students will have a place to sit.
         Input: 20
         Input: 25
         Output: There are 5 extra seats

         Input: 25
         Input: 1
         Output: There are 24 students left without chairs */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of students in the class");
//        int students = scanner.nextInt();
//        System.out.println("Enter number of chairs in the classroom");
//        int chairs = scanner.nextInt();
//        int charesLeft = chairs - students;
//        if (charesLeft > 0) {
//            System.out.println("There are " + charesLeft + " extra seats");
//        } else if (charesLeft < 0) {
//            System.out.println("There are " + charesLeft * (-1) + " students left without chairs");
//
//        } else {
//            System.out.println(" There are enough chares for oll students");
//        }



        /* 2) A student will not be allowed to sit in exam if his/her attendance
        is less than 75%.Take following input from user
        Number of classes held Number of classes attended.
        And print percentage of class attended. Is student is allowed to sit in exam or not?
        Example input:
        int classes = 20;
        int attended = 12;
        Expected output: Percentage of attended classes is 60, Student is not allowed to exam. */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many classes held");
//        int held = scanner.nextInt();
//        System.out.println("How many classesAttended");
//        int attended = scanner.nextInt();
//        if ((attended / held * 100) >= 75){
//            System.out.println("Percentage of attended classes is " + attended + " Student is not allowed to exam.");
//        }
//        else {
//            System.out.println("student is allowed to sit in exam");
//        }



     /*  3) A shop will give discount of 10% if the cost of purchased quantity
        is more than 1000$. Ask user for quantity. Suppose, one unit will cost 100$.
         Judge and print total cost for user, if no discount just print no discount.
        Example input: int num = 20;
        Expected output: Total cost 2000, discount 200 cost after discount 1800   */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of units: ");
        int quantity = scanner.nextInt();
        //  one unit costs $100
        int totalCost = quantity * 100;
        double discount = totalCost * 0.1;
        if (totalCost >= 1000) {
            System.out.println("Total cost "+ totalCost +" after a 10% discount total is : $" + (totalCost - discount));
        } else {
            System.out.println("Total cost: $" + totalCost + " (No discount applied)");
        }




        /*  4) Write a program that accepts 3 different numbers from the keyboard.
                The class should display these numbers in ascending order -
                in one line, and in the other in descending order.
        Input: 23
        Input: -5
        Input: 99
        Expected output:-5, 23, 99
                         99, 23, -5  */
    /*   Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
       double a = scanner.nextDouble();
        System.out.println("Enter your second number");
       double b = scanner.nextDouble();
        System.out.println("Enter your third number");
       double c = scanner.nextDouble();

//        int[] numbers = new int [] {23, -5, 99}; //// array
//        Arrays.sort(numbers);
//        for(int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i]);
//            System.out.print(" ");


        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a <= c && c <= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b <= c && c <= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c <= a && a <= b) {
            System.out.println(c + " " + a + " " + b);
        }
     else {
        System.out.println(c + " " + b + " " + a);
    }
       if (a >= b && b >= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= c && c >= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b >= a && a >= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c >= a && a >= b) {
            System.out.println(c + " " + a + " " + b);
        } else {
            System.out.println(c + " " + b + " " + a);
        } */


    }

        }





