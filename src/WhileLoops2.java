import java.util.Scanner;

public class WhileLoops2 {
    public static void main(String[] args) {
      /*  1: Create a program, that asks user to enter a number, until user enters 999.
        Program should count number of entered numbers, 999 not included.
        Input: 12
        Output: Try again!
                Input: 9
        Output: Try again!
                Input: 998
        Output: Try again!
                Input: 199
        Output: Try again!
                Input: 999
        Output: You entered 5 number */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int count = 0;
        int number;
        while (true) {
            number = scanner.nextInt();
            count++;
            if (number == 999) {
                System.out.println("You entered " + count + " numbers.");
                break;
            } else {
                System.out.println("Try again!");
            }
        }


       /* 2: Create a program that takes 5 digit String number and using while, loop it
        reverses the number and prints it.
        Input: 52349
        Output: 94325
        Input: 92442
        Output: 24429   */
//        Scanner scanner = new Scanner(System.in);
//        String number = "";
//        while (number.length() != 5) {
//            System.out.println("Enter 5 digit number: ");
//            number = scanner.nextLine();
//        }
//        int i = number.length() - 1;
//        while(i >= 0){
//            System.out.print(number.charAt(i));
//           i--;
//        }




        /*3: Create a program, that takes birth month for 5 students.
         And calculates numbers of students who was born in Winter, Spring, Summer and Autumn.
        Input: September
        Input: October
        Input: June
        Input: December
        Input: February
        Output: 2 in Winter, 0 in Spring, 1 in Summer and 2 in Autumn.  */
//        Scanner scanner = new Scanner(System.in);
//        int winter = 0, spring = 0, summer = 0, autumn = 0;
//        System.out.println("Enter month for 5 students: ");
//        String month;
//        for (int i = 0; i < 5; i++) {
//            month = scanner.nextLine();
//            month = month.toLowerCase();
//            if (month.equals("december") || month.equals("january") || month.equals("february")) {
//                winter++;
//            } else if (month.equals("marth") || month.equals("april") || month.equals("may")) {
//                spring++;
//
//            } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
//                summer++;
//
//            } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
//                autumn++;
//            }
//        }
//        System.out.println(winter + " in Winter, " + spring +" in Spring, " + summer + " in Summer and " + autumn + " in Autumn.");




       /* 4: Create a program that takes from user a number, until entered number
        is divisible by 5 and 9. Once desired number is entered, print the number
        of attempts.
        Input: 23
        Output: Try again!
                Input: 93
        Output: Try again!
                Input: 1256
        Output: Try again!
                Input: 9122
        Output: Try again!
                Input: 360
        Output: 5 attempts. */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Enter your number: ");
//        int number = 1;
//        int counter =0;
//        while (number % 5 != 0 && number % 9 != 0) {
//            number = scanner.nextInt();
//            counter++;
//        }
//        System.out.println(counter + " attempts");
    }

}




