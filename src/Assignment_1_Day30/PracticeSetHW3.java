package Assignment_1_Day30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class PracticeSetHW3 {
    public static void main(String[] args) {
        /*•Create an array with the length 100. Fill the array with random ints between 1-10 and print array.
        •Take all numbers divisible by 3 from array and add them to new arrayList and print arrayList.
        •Create new HashSet and add all elements of arrayList to the set.
        •Calculate and print number of all unsuccessful tries in task 3.  */
        Random random = new Random();
        int randomNumber;
        int[] numberArray = new int[100];
        for (int i = 0; i< numberArray.length; i++){
            randomNumber = random.nextInt(1,10);
            numberArray[i] = randomNumber;
            System.out.println(randomNumber);
        }
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < numberArray.length; i++){
            if(numberArray[i] % 3 == 0){
                oddNumbers.add(numberArray[i]);
            }
        }
        int nrExceptions = 0;
        for(int num : oddNumbers ){
            try{
                hashSet.add(num);
            }catch (Exception e){
                nrExceptions++;
            }

        }

    }
}
