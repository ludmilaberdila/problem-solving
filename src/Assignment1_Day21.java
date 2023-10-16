import java.util.Scanner;


public class Assignment1_Day21 {
    public static void main(String[] args) {
        /* 1.(RETURN TYPE)Write a Java method called calculateSum that takes two integers using Scanner
        as parameters and returns their sum.
        Expected output: Input : 4, Input : 6, Output : 10  */
        Scanner scanner = new Scanner(System.in);
        text("Enter first number: ");
      //  int num1 = scan(scanner) ;
      //  text("Enter second number: ");
     //   int num2 = scan(scanner);
//        calculateSum(num1,num2);
//        text("enter a word: ");
//        String name = scanner.nextLine();
      //  text(nametoUpercase(name));
       // day(name);
       // text("" + calculate(num1,num2));
       // isEven(num1);
        double userDouble = scanner.nextDouble();
        text("" + mutiplied(userDouble));
       // text("Input : " + num1 +", Input : " + num2 + ", Output : " + calculateSum(num1, num2));
    }
        public static void text(String message){
            System.out.println(message );
        }
        public static int scan(Scanner scanner){
            return scanner.nextInt();
        }
//        public static int calculateSum(int num1, int num2){
//        return  num1 + num2;
//        }

      /* 2.(VOID)Write a Java method called calculateSum that takes two integers using Scanner
       as parameters and prints their sum.
      Expected output:
      Input : 4
      Input : 6
      Output : 10  */

        public static void calculateSum(int m1, int m2){
           text("Input: " + m1 + "Imput: " + m2 + " Output:" + (m1 + m2));

        }

       /* 3.(RETURN TYPE)Create method a that takes a String using Scanner
        and returns a String with all uppercase letters.
        Expected output:
        Input : codewise
        Output : CODEWISE   */
        public static String nametoUpercase(String name) {
            return name.toUpperCase();
        }

     /*Task 2.2:  EASY
     (VOID)Create a method that takes a String using Scanner
    and prints the String with all uppercase letters.
    Expected output:
    Input : codewise
    Output : CODEWISE */

    public static void day(String message){
        System.out.println(message.toUpperCase() );
    }
    /*Task 3:  EASY
     (RETURN TYPE)Create a method that takes two ints numbers using Scanner,
    divides one int by another and returns the result miltiplied by 10.
    Expected output:
    Input : 10, 20
    Output : 5  */
    public static int am(Scanner scanner){
        return scanner.nextInt();
    }
        public static int calculate(int a1, int a2){
        return  (int)((a1 / (a2 * 1.0)) * 10);
        }
    /*Task 4:  EASY
     (VOID)Create a method called isEven that takes an integer as a parameter
    and prints true if the number is even and false otherwise.
    Expected output:
    Input : 46
    Output : true
    Input : 3
    Output : false   */
    public static void isEven(int m1){
    if(m1 % 2 ==0){
        text("true");
    }
    else{
        text("false");
    }
    }

    /*Task 5:  EASY
    (RETURN TYPE)Create a method that takes a double number using Scanner
    and returns that double multiplied by 100.
    Expected output:
    Input : 2.5
    Output : 250  */

    public static double mutiplied(double c1){
        return (c1 * 100);
    }

}
