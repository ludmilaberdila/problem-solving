package Assignment_1_Day22;
/*Create a method called isPalindrome that takes a string as a parameter and returns true if
        the string is a palindrome (reads the same forwards and backwards), and false otherwise.
        Expected output:
        Input : madam
        Output : true
        Input : car
        Output : false  */
public class isPalindrome {
    public static void main(String[] args) {
        String a1 = "madam";
        String a2 = "car";

        System.out.println("Input: " + a1);
        System.out.println("Output: " + isPalindrome(a1));

        System.out.println("Input: " + a2);
        System.out.println("Output: " + isPalindrome(a2));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
