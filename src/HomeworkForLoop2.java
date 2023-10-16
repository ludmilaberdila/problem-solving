import java.util.Scanner;

public class HomeworkForLoop2 {
    public static void main(String[] args) {
  /*1. Create a program that asks user to enter any word and print the word
   in reversed order. For example:
   Input: hello everyone, Output:  enoyreve olleh  */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//      String word = scanner.nextLine();
//       for (int i = word.length() - 1; i >= 0; i--) {
//           System.out.print(word.charAt(i) + " ");}


/*2. Create a loop that prints all March days from 1 to 31
  Output: 1 March 2023.....31 March 2023  */
//        for (int i = 1; i <=31; i++){
//             System.out.println(i + " March 2023");}


/* 3. Create a program that asks user to enter start and end int values.
     You will need to print numbers divisible by 3 or 5 within this range. */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the start value: ");
//        int start = scanner.nextInt();
//        System.out.print("Enter the end value: ");
//        int end = scanner.nextInt();
//       for (int i = start; i<=end;i++ ){
//           if(i % 3  ==0 || i % 5 == 0){
//               System.out.println(i);}


      /*4. Write a Java program to calculate the sum of the even numbers
          between 1 to 100 inclusive using a for loop.
          Example(Not output): 2 + 4 + 6 + 8 + ... + 100  */
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0){
//                sum += i;
//        }
//    }
//        System.out.println("The sum of the even numbers between 1 to 100 is: " + sum); }




  /*  5. Write a program that takes a number as input using scanner
    class and calculates the factorial of a number.
    For example, input is 5, then factorial is 5 * 4 * 3 * 2 * 1 = 120  */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int totalfactorial = 1;
        System.out.print("input is " + number + ", then factorial is ");
        for (int i = number; i >= 1; i--) {
            totalfactorial = totalfactorial * i; // totalfactorial * =i
            if(i > 1){
                System.out.print("" + i + " * ");
            }else{
                System.out.print("" + i);
            }
        }
        System.out.print(" = " + totalfactorial);
    }
}




