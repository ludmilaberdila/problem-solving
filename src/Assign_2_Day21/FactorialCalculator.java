package Assign_2_Day21;

public class FactorialCalculator {

    public static int calculateFactorial(int nr) {
        int n =1;
        for (int i = 2; i <= nr; i++){
            n *= i;
        }
        return n;
    }

    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
    /*Write a method called calculateFactorial that takes an integer as a parameter
    and returns the factorial of that number.
        Expected output:
        Input : 5
        Output : 120 */
