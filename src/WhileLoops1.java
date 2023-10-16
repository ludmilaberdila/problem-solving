import java.util.Scanner;

public class WhileLoops1 {
    public static void main(String[] args) {
     /*   1:  Create a program with a while loop that asks the user for a negative number.
      If the number entered is negative, simply print it. However,
      if a positive number is entered, the loop should continue asking the user
       to input a number.
        Expected output:
        Input: 17
        Output “Enter a number”
        Input: 9
        Output “Enter a number”
        Input: -5
        Output: -5  */
        Scanner scanner = new Scanner(System.in);
        int number;

        while(true){
            System.out.println("Enter negative number: ");
            number = scanner.nextInt();
            if(number < 0){
                System.out.println("Greate job you enter a negative number: " + number);
               break;
            }
        }



      /*  2. Write a program that takes a number as input using scanner
        class and calculates the factorial of a number using WHILE LOOP.
        For example, input is 5, then factorial is 5 * 4 * 3 * 2 * 1 = 120
        Output: 120  */
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int factorial = 1;
//        int i = 1;
//
//        if (number < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            while (i <= number) {
//                factorial *= i;
//                i++;
//            }
//        }
//        System.out.println("Factorial of " + number + " is: " + factorial);



      /*  3:  Write a program to enter the numbers till the user wants and at the end
       it should display the sum of the numbers user entered.
                Expected output:
        Enter a number
        Input: 10
        Do you want to continue? y/n
        Input: y
        Enter a number
        Input: 20
        Do you want to continue? y/n
        Input: n
        Output “Sum of the numbers your entered is 30”   */
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        char choice;
//        int number;
//        boolean continueAdding = true;
//        while (continueAdding) {
//            System.out.print("Enter a number: ");
//            number = scanner.nextInt();
//            sum += number;
//            System.out.print("Do you want to continue? (y/n): ");
//            choice = scanner.next().charAt(0);
//            if (choice != 'y' && choice != 'Y') {
//                continueAdding = false;
//            }
//        }
//        System.out.println("Sum of the entered numbers is: " + sum);



       /* 4 : Write a program to enter the numbers till the user wants and
       at the end it should display the count of positive, negative and zeros entered
        Expected output:
        Enter a number
        Input: 10
        Do you want to continue? y/n
        Input: y
        Enter a number
        Input: -5
        Do you want to continue? y/n
        Input: y
        Enter a number
        Input: 0
        Do you want to continue? y/n
        Input: n
        Output “You entered 1 positive number, 1 negative number and 1 zero”  */
//        Scanner scanner = new Scanner(System.in);
//        char choice;
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//        boolean continueEntering = true;
//        while (continueEntering) {
//            System.out.print("Enter a number: ");
//            int number = scanner.nextInt();
//            if (number > 0) {
//                positiveCount++;
//            } else if (number < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//            System.out.print("Do you want to continue? (y/n): ");
//            choice = scanner.next().charAt(0);
//            if (choice != 'y' && choice != 'Y') {
//                continueEntering = false; // Stop the loop for any choice other than 'y' or 'Y'
//            }
//        }
//        System.out.println("Count of positive numbers: " + positiveCount);
//        System.out.println("Count of negative numbers: " + negativeCount);
//        System.out.println("Count of zero numbers: " + zeroCount);



     /*   5:  Write a program using do while loop that prompts the user to enter a string.
     The program should display the number of digits in the string.
     The program should keep prompting the user to enter string until user
     enters a string with 3 digits. Hint: Character.isDigit() methods;
        Expected output:
        Enter a string
        Input: hello
        Output 0 digits
        Enter a string
        Input: hello12
        Output 2 digits
        Enter a string
        Input: code1245
        Output 4 digits
        Enter a string
        Input: codewise123
        Output: You entered a string with 3 digits!  */
//        Scanner scanner = new Scanner(System.in);
//        int digitCount = 0;
//        String input;
//
//        do {
//            System.out.print("Enter a string: ");
//           input = scanner.nextLine();
//            for (char ch : input.toCharArray()) {
//                if (Character.isDigit(ch)) {
//                    digitCount++;
//                }
//            }
//            System.out.println("Output: " + digitCount + " digits");
//            if (digitCount == 3) {
//                System.out.println("You entered a string with 3 digits!");
//                break;
//            }
//            digitCount = 0;
//        } while (true);
    }
}


