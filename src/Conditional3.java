import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {
      /*  1: Write a program that takes two integers as input and checks if their sum is even or odd.
           Print "Even" if the sum is even, and "Odd" if the sum is odd.
           Input: 5
           Input: 4
           Expected output: Odd  */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Imput: ");
        int number1 = scanner.nextInt();
        System.out.print("Imput: ");
        int number2 = scanner.nextInt();
       int a1 = (number1 + number2) % 2;
       if (a1 == 0){
           System.out.println("The sum is Even");
       } else {
           System.out.println("The sum is Odd");
       }*/

      /*  2: Write a program that takes three integers as input and checks if any two of them are equal.
        Print "Two of the numbers are equal" if any two of the numbers are equal, and "None of the numbers are equal"
        if none of the numbers are equal.
        Example input:
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;
        Expected output: Two of the numbers are equal  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Imput 1: ");
//        int a1 = scanner.nextInt();
//        System.out.print("Imput 2: ");
//        int a2 = scanner.nextInt();
//        System.out.print("Imput 3: ");
//        int a3 = scanner.nextInt();
//        if (a1 == a2 && a3 == a1 && a2 == a3){
//            System.out.println(" all of them are equal");
//        } else if (a1 == a2 || a3 == a1 || a2 == a3){
//            System.out.println("Two of the numbers are equal");
//        } else {
//                System.out.println("None of the numbers are equal");
//            }
     /*   3: Write a program that prompts the user to enter a string. Check if the string starts with the letter 'A'
          (ignoring case). If it does, print "The string starts with 'A'. " Otherwise, print "The string does not" + start with 'A'."
           Input: AAA is an example sentence
           Expected output: The string starts with 'A' */
//        Scanner scanner = new Scanner(System.in);
//      System.out.println("Please enter a string :");
//      String string = scanner.nextLine();
//      if (string.toLowerCase().startsWith("a")) {
//          System.out.println("The string starts with A");
//      }
//      else {
//          System.out.println("The string does not start with A ");
//      }

      /* 4: Write a program that takes an integer as input and checks if it is a
        'multiple of 3 and 5' or 'multiple of 3 or 5'  or ' is not their multiple'
        Input: 9;
        Expected output: Multiple of 3 or 5
        Input: 45
        Expected output: Multiple of 3 and 5
        Input: 23
        Example output: Is not their multiple */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter your integer : ");
//        int a1 = scanner.nextInt();
//        if (a1 % 3 == 0 || a1 % 5 == 0 ){
//            System.out.println("Multiple of 3 or 5");
//        }
//        else{
//            System.out.println("Is not their multiple");
//        }

  /* 5: Write a program that asks the user to enter a string. Check if the string is a valid email
   address by verifying if it contains the '@' symbol, ends with a valid domain extension
   (".com", ".org", ".net") and with minimum length of 10.
   Print "Valid email address" or "Invalid email address" accordingly.
    * musth have @
    * must have domain like: .com, .org or .net
    * must have length of at least 10
     Input: zhanarbek@gmail.com
     Output: Valid email address  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please your email");
        String email = scanner.nextLine();
        if (email.length() >= 10 && email.contains("@") && (email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net"))) {
            System.out.println("valid email adress");
        } else {
            System.out.println("invalid email");
        }

    }
}

