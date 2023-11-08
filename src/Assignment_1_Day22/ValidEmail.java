package Assignment_1_Day22;

import java.util.Scanner;
  /*Create a method that takes a String and returns true if it is a valid email
        Valid email is:
        * contains "@" and length> 10 and ends with .com or .net or .org
        * If it is valid email return true otherwise false
        Create main method, call the method and print the returned value.

        Expected output:
        Input : codewise.com
        Output : false
        Input : a@a.com
Output : false
        Input : coder@gmail.com
Output : true  */

public class ValidEmail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a email address: ");
        String email = scanner.nextLine();
        boolean isValid = isValidEmail(email);
        System.out.println("the email valid is:  " + isValid);
    }

    public static boolean isValidEmail(String email) {
        if (email.contains("@") && email.length() > 10 &&
                (email.endsWith(".com") || email.endsWith(".net") || email.endsWith(".org"))) {
            return true;
        } else {
            return false;
        }
    }
}
