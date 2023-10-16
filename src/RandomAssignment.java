import java.util.Random;
import java.util.Scanner;

public class RandomAssignment {
    public static void main(String[] args) {


        /* 1. Write a program that generates 5 random numbers
        within this range (20-31) and prints them in new lines using for loop.
                Expected output something like this but not exactly:
        28,23,28,29.20  */
//        Random random = new Random();
//        int numberRandom;
//        for(int i = 0; i < 5; i++ ){
//         numberRandom = random.nextInt(20, 31);
//            System.out.println(numberRandom);
//        }


       /* 2. Write a program that generates 3 random numbers
        within this range (1-5), print random number itself and random number multiplied by 2
        Expected output something like this but not exactly:
        3, 6
        1, 2
        4, 8  */
//        Random random = new Random();
//        int numberRandom;
//        for(int i = 0; i < 3; i++ ) {
//            numberRandom = random.nextInt(1, 5);
//            System.out.println(numberRandom + ", " + numberRandom * 2 );
//        }


      /*  3. Write a program that generates 5 random numbers within
        this range (1,11) and prints them in new lines and the last line
        is their sum
        Expected output something like this but not exactly:
        1
        5
        8
        9
        2
        Sum of random numbers is 25 */
        Random random = new Random();
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            int randomNumber = random.nextInt(11);
            System.out.println(randomNumber);
            sum += randomNumber;
        }
        System.out.println("The sum of random numbers is " + sum);
    }
}
