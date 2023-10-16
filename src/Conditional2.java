import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {
       /* Task: 1 Write a Java program that asks a user which city he/she lives. If user answers Chicago
        tell him/her to join Codewise Java classes from campus, if he/she answers other city from Chicago
        tell him/her to join classes online.  Input: Chicago
        Output: Join Codewise Java classes from campus. */
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Which city do you live in?");
        String city = scanner.nextLine();
        if (city.equalsIgnoreCase("Chicago")) {
            System.out.println("join Codewise Java classes from campus");}
      else{
            System.out.println("join classes online");
        } */

       /* Task: 2 Write a Java program that asks the user to enter a school grade and checks if it
        is A, B, C, D or F,  using if-else statement.
        Input: A,  Output: Student was graded A.
        Input: B, Output: Student was graded B.  */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your school Grade!(A, B, C, D or F)");
        String grade = scanner.nextLine();
        if (grade.equalsIgnoreCase("A")){
            System.out.println("Student was graded A");}
       else if (grade.equalsIgnoreCase("B")) {
            System.out.println("Student was graded B");
      }
        else if (grade.equalsIgnoreCase("C")) {
            System.out.println("Student was graded C");
        }
        else if (grade.equalsIgnoreCase("D")) {
            System.out.println("Student was graded D");
        }
        else if (grade.equalsIgnoreCase("F")) {
            System.out.println("Student was graded F");
        }
        else  {
            System.out.println("Invalid Grade");
        } */

        /*Task: 3 Write a Java program that asks the user to enter their
        age and checks if they are eligible to vote. Starting from 21 person is eligible to vote.
        Input: 23,  Output: You are eligible to vote! */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age!");
        int age = scanner.nextInt();
        if (age>=21){
            System.out.println("You are eligible to vote!");
        }
           else {
                System.out.println("you are NOT eligible to vote");
            }  */

      /*  Task: 5 Write a Java program that asks the user to enter two strings and checks if their values are equal.
          Input: Hello, Input: hello
          Output: Hello and hello are not the same.*/
     /*  Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter two strings!");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        if (str1.equals(str2)){
            System.out.println(str1 + " and " + str2 + " are equal");
        }
  else System.out.println(str1 + " and " + str2 + " are Not equal" );
    }*/


     /*Task: 6 Write a Java program that takes a number from 1 to 7 from the user and prints the weekday name.
     1-Monday  2- Tuesday  7 –Sunday. If any other number then 1-7 then print “no such day”
      Input: 1 Output: Today is Monday...
      Input: 9 Output: No such day.  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weekday number!");
        byte weekday = scanner.nextByte();
        if(weekday == 1){
            System.out.println("Today is Monday!");
        }
        else if(weekday == 2){
            System.out.println("Today is Tuesday!");
        }
        else if(weekday == 3){
            System.out.println("Today is Wednesday!");
        }
        else if(weekday == 4){
            System.out.println("Today is Thursday!");
        }
       else if(weekday == 5){
            System.out.println("Today is Friday!");
        }
        else if(weekday == 6){
            System.out.println("Today is Saturday!");
        }
        else if(weekday == 7){
            System.out.println("Today is Sunday!");
        }
        else {
            System.out.println("NO SUCH DAY");
        }

    }
}
