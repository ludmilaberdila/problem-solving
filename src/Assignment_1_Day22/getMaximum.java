package Assignment_1_Day22;
        /*Create a method called getMaximum that takes an array of integers as a parameter
        and returns the maximum value in the array and prints it in the main method
        So in the main method you must create an array of integers, call a method and print it
        Expected output:
        Input : [1,5,7,12,3,8]
        Output : 12
        Input : [1,2,4,9,3,8,6]
        Output : 9    */
        public class getMaximum {
            public static void main(String[] args) {
                int[] array = {1, 5, 7, 12, 3, 8};
                System.out.println(largestElement(array));
                int[] array2 = {1, 2, 4, 9, 3, 8, 6};
                System.out.println(largestElement(array2));
            }

            public static int largestElement(int[] array) {
                int largest = array[0];
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > largest) {
                        largest = array[i];
                    }
                }
                return largest;
            }
        }


