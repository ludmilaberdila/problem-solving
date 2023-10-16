import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
       /* 1.  Write a program that prints multiplications table.
                Ask user starting and ending numbers.
                Also ask user for which number is multiplication table.
                Enter The Starting Number :1
        Enter The Ending Number :5
        Enter The Tables Number :3
        Output:
        3 * 1 = 3
        3 * 2 = 6
        3 * 3 = 9
        3 * 4 = 12
        3 * 5 = 15 */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the start value: ");
//        int start = scanner.nextInt();
//        System.out.print("Enter the end value: ");
//        int end = scanner.nextInt();
//        System.out.println("Enter The Tables Number :");
//        int tableNumber = scanner.nextInt();
//        for (int i = start; i <= end; i++ ){
//            System.out.println("" + tableNumber + " * " +  i  + " = " + (i * tableNumber));}

       /* 2. Write a program that takes a word as input using scanner class and
           prints it in reversed.
           Expected output:
           Given word HELLOWORLD, Reversed number DLROWOLLEH */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//      String word = scanner.nextLine();
//       for (int i = word.length() - 1; i >= 0; i--) {
//           System.out.print(word.charAt(i) + " ");}



      /*  3. Write a java program which takes from user int n number,
            then prints from 1 to n, with difference of multiplication 4
        Input: 350
        Output:
        1
        4
        16
        64
        256 */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the n number: ");
//        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i*=4) {
//            System.out.println(i);}



      /*  4. Write a program that takes from user to enter 2 string values, str1 and str2.
        Print the number of occurences of str2 in str1.
        your str2 every time must be only 3 letters
        Input: codingiscodingbutnotcode
        Input: cod
        Output: cod is repeated 3 times
        Explanation: cod is repeated in codingiscodingbutnotcode 3 times  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value :");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int counter = 0;
        for(int i = 0; i <= str1.length()-3; i++){
            String result = str1.substring(i,i+3);
            if(result.equals(str2)){
                counter++;
            }
        }
        System.out.println("Cod is repeated " + counter  + " times" );}

}
