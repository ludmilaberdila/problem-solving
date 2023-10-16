import java.io.StringWriter;
import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
      /*  1. Write a program that takes a number as
        input using scanner class and calculates the sum of the digits of a number.
        For example, if the input is 12345, the output should be 15 (since 1+2+3+4+5=15).
        Use conversion from String to int and a String method.
        Input: 945
        Output: 18   */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = scanner.nextInt();
        int result = 0;
        for (int i = number; i > 0; i /= 10) {
            result += (i % 10);
        }
        System.out.println(result);
    }


    /*    2. Write a java program that accepts 5 integers from the keyboard and displays
        information about how many of them were even and how many are odd.
                Input: 1
        Input: 23
        Input: 933
        Input: 3
        Input: 1244
        Output: 4 odd, 1 even  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 5 integer numbers: ");
//        int countEven = 0;
//        int countOdd = 0;
//        for (int i = 1; i <= 5; i++) {
//            int numbers = scanner.nextInt();
//            if (numbers % 2 == 0) {
//                countEven++;
//            } else {
//                countOdd++;
//            }
//        }
//        System.out.println("Numbers of evens is " + countEven);
//        System.out.println("Numbers of odd is " + countOdd);



        /*3. Write a program that takes from user a word and determines
         whether a given string is a palindrome (reads the same forwards and backwards).
         Input: rotator
         Output: It is a palindrome
         Input: cool
         Output: It is not a palindrome
         Input: macbook
         Output: It is not a palindrome  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your String: ");
//        String str = scanner.nextLine();
//        String orgStr = str;
//        String rev = "";
//        int len = str.length();
//        for (int i = len - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (orgStr.equals(rev)) {
//            System.out.println(orgStr + " It is a Polidrome String");
//        } else {
//            System.out.println(orgStr + " It is Not a Polindrome String");
//        }



        /*   4. Write a program that takes from user 6 integers and
        displays information about how many of them
        were larger than the first number.
        Input: 15
        Input: 9
        Input: 209
        Input: 19
        Input: 4
        Input: 123
        Output: There are 3 numbers larger than 15 */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter numbers: ");
//        int firstNumber = scanner.nextInt();
//        int countLarger = 0;
//        for (int i = 0; i < 5; i++){
//            int num = scanner.nextInt();
//            if (num > firstNumber){
//                countLarger++;
//            }
//        }
//        System.out.println("The are: " + countLarger + " numbers larger than " + firstNumber);
//    }
//    }


      /*  5. Write a program that takes a word from user
        and prints every second letter in upper case
        // 1 3 5 7 - uppercase
        // 0 2 4 6 - as they are
                INPUT: macbook
        OUTPUT: mAcBoOk   */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//        String word = scanner.nextLine();
//        StringBuilder modifiedWord = new StringBuilder();
//        for (int i = 0; i < word.length(); i++) {
//            char currentChar = word.charAt(i);
//            if (i % 2 == 1) {
//                modifiedWord.append(Character.toUpperCase(currentChar));
//            } else {
//                modifiedWord.append(currentChar);
//            }
//        }
//        System.out.println("Word with every second letter in uppercase: " + modifiedWord.toString());
}

