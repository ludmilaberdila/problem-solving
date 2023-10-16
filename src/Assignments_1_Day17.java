import java.util.Random;
import java.util.Scanner;


public class Assignments_1_Day17 {
    public static void main(String[] args) {
            /*1. Write a program that uses generates and uses 10 random numbers for head or tail
               and prints in the end who wins heads or tails.
              * 1 is head
              * 2 is tail
              If your generated numbers are 1 2 2 2 2 2 2 1 1 1
        Output: There are 6 heads, head wins  */
//        Random random = new Random();
//        int numberOfTosses = 10;
//        int headCount = 0;
//        int tailCount = 0;
//        for (int i = 0; i < numberOfTosses; i++) {
//            int randomNumber = random.nextInt(2) + 1;
//            if (randomNumber == 1) {
//                System.out.println(" Head");
//                headCount++;
//            } else {
//                System.out.println(" Tail");
//                tailCount++;
//            }
//        }
//        if (headCount > tailCount) {
//            System.out.println("There are " + headCount + " heads, head wins!");
//        } else if (tailCount > headCount) {
//            System.out.println("There are " + tailCount + " heads, head wins!");
//        } else {
//            System.out.println("It's a tie. There are an equal number of heads and tails.");
//        }



        /* 2. Write a program that generates random number between 1-10 inclusive.
                Then user needs to guess this number until user enters secret number.
           * user has only has 3 attempts otherwise he lose the game
        random.nextInt() -> 8
        Input: 1
        Try again
        Input: 5
        Try again
        Input: 8
        Congratulation! You guessed the number 8! */

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println("Enter a secret number:");
//        int secretNumber = random.nextInt(1, 11);
//        int attempts = 3;
//        int guessNumber;
//        while(attempts > 0) {
//            guessNumber = scanner.nextInt();
//            attempts--;
//            if (guessNumber == secretNumber) {
//                System.out.println("You guessed the secret number is: " + guessNumber);
//                break;
//            }
//            else{
//                System.out.println("Try again, you didn't guess!");
//                }


         /*  3. Write a program which generates 15 numbers in this range (50,101);
           These random numbers represent the students grades for the exam.
           You need to print whether students go for free or need to pay for summer camp,
           including average grade of the students.
           * If the average grade for the exam is greater than 70
           print that students go to a summer camp for free
                * Otherwise they need to pay for summer camp
            If these are your random numbers: 50, 53, 61, 99, 100, 80, 87, 63, 78, 55, 86, 100, 77, 65, 19
           Output: You summer camp is free of charge, because your average is about 71.53  */
        Random random = new Random();
        int totalGrades = 15;
        int gradeSum = 0;
        System.out.print("Student Grades: ");
        for (int i = 0; i < totalGrades; i++) {
            int grade = random.nextInt(52) + 50;
            gradeSum += grade;
            System.out.print(grade + " ");
        }
        System.out.println();
        double averageGrade = (double) gradeSum / totalGrades;
        System.out.println("Average Grade: " + averageGrade);
        if (averageGrade > 70) {
            System.out.println("Students go to summer camp for free.");
        } else {
            System.out.println("Students need to pay for summer camp.");
        }
    }
}



