package Assignment_2_Day22;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        /*Task 3:  Medium
          Create a method called findMaxMin that takes an array of integers as a parameter and prints
        an array containing the maximum and minimum values in the array, and call it in the main method.
       Expected output:
       Input : [10,15,20,25,30]
      Output : [10,30]
       Input : [1,2,3,4,5,6,7]
      Output : [1,7]
          */
        int[] sort = {10,15,20,25,30};
        findMaxMin(sort);
        int [] sort2 = { 1,2,3,4,5,6,7};
        findMaxMin(sort2);
    }
    public static void findMaxMin(int[] num){
        int [] minMax = {num[0],num[0]};
        for(int i = 0; i< num.length; i++){
           if(num[i] < minMax[0]){
              minMax[0] = num[i];
           }
            if (num[i] > minMax[1]){
                minMax[1] = num[i];
            }
        }
        System.out.println(Arrays.toString(minMax));
    }
}
