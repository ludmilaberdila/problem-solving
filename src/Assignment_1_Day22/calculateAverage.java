package Assignment_1_Day22;
    /*Create a method called calculateAverage that takes an array of integers
    as a parameter and returns the average of the numbers and prints it in the main method.
     So in the main method you must create an array of integers, call a method and print it
        Expected output:
        Input : [10,20,30]
        Output : 20
        Input : [5,5,7,7]
        Output : 6  */
public class calculateAverage {
        public static void main(String[] args) {
            int [] n1 = {10, 20, 30};
            System.out.println(average(n1));

            int [] n2 ={5, 5, 7, 7};
            System.out.println(average(n2));

        }
        public static int average(int [] ls){
            int total = 0;
            for (int i = 0; i < ls.length; i++) {
               total += ls[i];
            }
            return total / ls.length;
        }
}
