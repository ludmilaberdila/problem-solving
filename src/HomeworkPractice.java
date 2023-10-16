public class HomeworkPractice {
    public static void main(String[] args) {
//    // multiplication 1 to 10, int x=4 //I used for loop, "exemple only for me"
//        int number = 4;
//        for (int x = 0; x < 11; x++) {
//            System.out.println(number + " * " + x + " = " + (number * x));
//        }
    /* Task 1 :Print multiplication table from 1 to 10 with x.
           Declare variable  int x = 4;
        int x = 4;
        System.out.println(x + " * 0 = " + x * 0);
        System.out.println(x + " * 0 = " + x * 1);
        System.out.println(x + " * 0 = " + x * 2);
        System.out.println(x + " * 0 = " + x * 3);
        System.out.println(x + " * 0 = " + x * 4);
        System.out.println(x + " * 0 = " + x * 5);
        System.out.println(x + " * 0 = " + x * 6);
        System.out.println(x + " * 0 = " + x * 7);
        System.out.println(x + " * 0 = " + x * 8);
        System.out.println(x + " * 0 = " + x * 9);
        System.out.println(x + " * 0 = " + x * 10); */


    /* Task 2 :Print division table from, dividing number 50 from 20 to 30 with x.
              Declare variable double number = 50 */
        float x=50;
        System.out.println((int)x + " / 20 = " + x / 20); // I transfer float x=50 in int
        System.out.println((int)x + " / 21 = " + x / 21);
        System.out.println((int)x + " / 22 = " + x / 22);
        System.out.println((int)x + " / 23 = " + x / 23);
        System.out.println((int)x + " / 24 = " + x / 24);
        System.out.println((int)x + " / 25 = " + x / 25);
        System.out.println((int)x + " / 26 = " + x / 26);
        System.out.println((int)x + " / 27 = " + x / 27);
        System.out.println((int)x + " / 28 = " + x / 28);
        System.out.println((int)x + " / 29 = " + x / 29);
        System.out.println((int)x + " / 30 = " + x / 230);

     /* Task 3: Declare variables: int q = 5; int w = 9, int e = 10;
           Print the sum of all three variables. */
        int q = 5,  w = 9, e =10 , sum ;
        sum = q + w + e;
        System.out.println("q+w+e = "+sum);

    /* Task 4: Declare variables: int c = 10; int d = 5;
           Using operators and variables, write a program that will print following lines
           of code:
           10 + 5 = 15
           10 - 5 = 5
           10 * 5 = 50
           10 / 5 = 2
           10 % 5 = 0 */

        int c = 10, d = 5;
        System.out.println( c + " + d =" + (10 + 5));
        System.out.println( c + " * d =" + 10 * 5);
        System.out.println( c + " / d =" + 10 / 5);
        System.out.println( c + " - d =" + (10 - 5));


    /*Task 5: Declare a variable int number = 0;
        Make an assign to the variable number so that sum of 2345 and 8 calculated first,
        then divide by 3, make modulus 5 and multiply by 5.
        Result (2345 + 8) / 3 % 5 * 5 = 20 */
        int number = (2345 + 8) / 3 % 5 * 5; //evaluate equate
        System.out.println("(2345 + 8) / 3 % 5 * 5 = " + number); //print value



    /*Task 6 : Print if the two numbers 23 and 45 are equal.
           Output must be false
        int a = 23, b = 45;
        //<,>,
        System.out.println(a>b); */


    /*Task 7: Write a program to check if the two numbers 25 is greater than 10.
          Output must be true

        int a = 25, b = 10;
        //<,>,
        System.out.println(a>b); */


    }
}





