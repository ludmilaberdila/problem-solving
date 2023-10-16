import java.util.Scanner;

public class Conditional1 {
    public static void main(String[] args) {
      /* Task: 1. Write a program that asks from user int number to enter, then check whether the number
       is positive, negative, or zero. The program should print out a message indicating the result:
       Expected output: number is positive or number is negative or number is zero  */
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number!");
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("Number is positive");
        }
        if (number<0){
            System.out.println("Number is Negative");
        }
        else if(number == 0) {
            System.out.println("Number is Zero");
        } *


        /*Task: 2. Write a program that asks from user double temperature to enter and check if
          it is below freezing (32 degrees or lower), above boiling (212 degrees or higher), or in between.
          Expected output: 77.3 degrees is between or 15 degrees is lower or 300 degrees is higher  */
       /* Scanner scanner = new Scanner(System.in);
       // System.out.println("Please Enter the Temperature!");
        double temperature = scanner.nextDouble();
        if (temperature<=32){
            System.out.println("The temperature is lower");
        }
        else if (temperature>=212){
            System.out.println("The temoerature is hight");
        }
        else {
            System.out.println("The temperature is between");
        } */

       /* Task: 3. Write a Java program that takes three numbers from the user and prints the greatest number.
          Input the 1st number: 25, Input the 2nd number: 78, Input the 3rd number: 87
          Expected Output : The greatest: 87   */
       /* System.out.println("Please Enter Your Number!");
        double number = scanner.nextDouble();
        if (number<=25){
            System.out.println("This is smoll number");
        }
        else if (number>=87){
            System.out.println("This is Greatest number");
        }
        else {
            System.out.println("This is Medium number");
        } */

        /*Task: 4. Write a program that takes from keybaord the months and tells which season it is
        (winter, spring, summer, or fall). Assume that winter starts in December, spring starts in March,
        summer starts in June, and fall starts in September.
         Expected output: summer season  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Month!");
            byte month = scanner.nextByte();

        if(month == 1){
            System.out.println("WINTER");
       }
       else if(month == 2){
            System.out.println("WINTER");
        }
        else if(month == 3){
            System.out.println("SPRING");
        }
        else if(month == 4){
            System.out.println("SPRING");
        }
        else if(month == 5){
            System.out.println("SPRING");
        }
        else if(month == 6){
            System.out.println("SUMMER");
        }
        else if(month == 7){

            System.out.println("SUMMER");
        }
        else if(month == 8){
           System.out.println("SUMMER");
        }
        else if(month == 9){
            System.out.println("FALL");
        }
        else if(month == 10){
            System.out.println("FALL");
        }
        else if(month == 11){
            System.out.println("FALL");
        }
        else if(month == 12){
            System.out.println("WINTER");
        }
       else{
           System.out.println("INVALID MONTH");
            }

       }
    }

