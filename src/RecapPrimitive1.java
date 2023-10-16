public class RecapPrimitive1 {
    public static void main(String[] args) {
     /*Task 1:a) Write program to convert temperature.
                Given temperature is in Celsius.
                Declare int temperature = 30;
                Convert it to Fahrenheit and store in a double variable
                Print the result as following: (9 * temperature + ( 32 * 5 )) / 5 = result
              //formula to convert Celcius to Fahrenheit is F = (9 * celsius + ( 32 * 5 )) / 5

        double Fahrenheit, Celsius;
        Celsius= 30;
        Fahrenheit = ((9 * Celsius) + (32 * 5)) / 5;
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit); */


        /* B)  Write program to convert temperature.
               Given temperature is in Fahrenheit.
               int temperature = 100;
               Convert it to Celcius and store in a double variable
               Print the result as following: 5 * (temperature - 32 ) /9 = result
               //formula to convert Fahrenheit to Celcius is C = (5 * ( fahrenheit - 32 )) / 9

        double Fahrenheit, Celsius;
        Fahrenheit = 100;
        Celsius = (5 * ( Fahrenheit - 32 )) / 9;
        System.out.println("Temperature in Celsiusis:" + Celsius); */


       /*Task 2)  Write a program that takes each digit of number 132 and assigns them to new variables
              a)prints them, As following: first digit = 1, second digit = 3, third digit = 2

        int number = 123;
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        System.out.println(firstDigit + "," + lastDigit + "," + secondDigit); */

       /*b)prints the sum of digits, As following: 1 + 3 + 2 = 6
            int a = 1, b = 3, c = 2;
            System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));  */



        /*b)prints the product of digits, As following: 1 * 3 * 2 = 6

           int a = 1, b = 3, c = 2;
           System.out.println(a + "*" + b + "*" + c + "=" + (a * b * c)); */


        /*c)prints the number 132 in reverse order (231) separated by commas, As following: 2, 3, 1*/

          int number = 123;
          int firstDigit = number / 100;
          int secondDigit = number / 10 % 10;
          int lastDigit = number % 10;
          System.out.println(secondDigit + "," + lastDigit + "," + firstDigit);

    }
}
