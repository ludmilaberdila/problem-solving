public class OperatorsHomework2 {
    public static void main(String[] args) {
    /*1. Write a program that calculates and prints the sum of two integers,
     number1 and number2, where number1 is 7 and number2 is 12.
     Expected output: The sum of 7 and 12 is 19. */

        int number1 = 7;
        int number2 = 12;
        System.out.println(number1 + "+" + number2 + "=" + (7 + 12));

     /*2. Write a program that calculates and prints the difference between two integers,
     number3 and number4, where number3 is 15 and number4 is 8.
     Expected output: The difference between 15 and 8 is 7.*/

        int number3 = 15;
        int number4 = 8;
        System.out.println(number3 + "-" + number4 + "=" + (number3 - number4));

    /*3. Write a program that calculates the product of three integers,
     number5, number6, and number7, where number5 is 3, number6 is 5, and number7 is 7.
     Expected output: The product of 3, 5, and 7 is 105. */

        int number5 = 3;
        int number6 = 5;
        int number7 = 7;
        System.out.println(number5 + "*" + number6 + "*" + number7 + "=" + (number5 * number6 * number7));

    /*4. Write a program that calculates the division of two integers, number8 and number9,
         where number8 is 20 and number9 is 5.
         Expected output: The division of 20 by 5 is 4.*/

        int number8 = 20;
        int number9 = 5;
        System.out.println(number8 + "/" + number9 + "=" + (number8 / number9));

     /*5. Write a program that calculates the remainder of two integers,
        number10 and number11, where number10 is 27 and number11 is 4.
        Expected output: The remainder of 27 divided by 4 is 3.*/

        int  number10 = 27;
        int number11 = 4;
        System.out.println(number10 + "%" + number11 + "=" +(number10 % number11));

     /*6. Write a program that calculates the result of raising an integer,
         number12 to a power of number13, where number12 is 2 and number13 is 5.
         Expected output: 2 raised to the power of 5 is 32.*/
        int number12 = 2; // 2 2 2 2
        int number13 = 5;
        for (int x = 1; x < number13; x++) {
            number12 *= 2;
        }
        System.out.println(number12);

     /*7. Write a program that calculates the average of three integers, number15,
    number16, and number17, where number15 is 10, number16 is 15, and number17 is 20.
    Expected output: The average of 10, 15, and 20 is 15.*/

      int number15 = 10;
      int number16 = 15;
      int number17 = 20;
        System.out.println(number15 + "+" + number16 + "+" + number17 + " = " + (number15 + number16 + number17) / 3);







    }
}