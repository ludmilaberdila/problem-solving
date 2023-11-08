package Assignment_2_Day22;

public class Problem4 {
    public static void main(String[] args) {
          /*
          Write a Java method called count Occurrences that takes a string and a character
           as parameters and returns the number of occurrences of the character in the string.
            Call this method in main method.
        Expected output:
      Input : hello
        Input: l
        Output : 2
      Input : codewiseeers
        Input: e
        Output : 4
           */
        String letter = "hello";
        char str = 'l';
       int occurrences = countOccurrences(letter, str);
        System.out.println(occurrences);
        String letter2 = "codewiseeers";
        char str2 = 'e';
        occurrences = countOccurrences(letter2, str2);
        System.out.println(occurrences);

    }

    public static int countOccurrences(String str, char letter) {
        int numbers = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                numbers++;
            }
        }
        return numbers;
    }
}