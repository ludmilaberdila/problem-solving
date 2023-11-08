package Assignment_2_Day28;
import java.util.ArrayList;
import java.util.Random;

public class PracticeArrayListHW5 {
    public static void main(String[] args) {
        /*Create PracticeArrayListHW5 java class and do the following tasks:

        1. Create an ArrayList of integers and add 10 random numbers in this range (10,50)
        to it using Random and for loop.
        2. Print ArrayList of integers
        3. Assign value 0 to elements less than 20
        4. Print ArrayList of integers */
        ArrayList<Integer> numberR = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
           int randomNumber = random.nextInt(10, 50);
            numberR.add(randomNumber);
        }
        System.out.println(numberR);

        for(int i =0; i < numberR.size(); i++){
            int number = numberR.get(i);
            if(number <20){
                numberR.set(i, 0);
            }

        }
        System.out.println("ArrayList of integers:" + numberR);
    }
}
