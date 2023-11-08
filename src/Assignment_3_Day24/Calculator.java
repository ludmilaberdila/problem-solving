package Assignment_3_Day24;

public class Calculator {
    public static void main(String[] args) {
        /*Create a Calculator class with basic functionalities to perform mathematical operations.
        Create a main method in the same class and create there 1 object of the Calculator class
          and call every method of a class with appropriate parameters.

        Requirements:
        The Calculator class should have the following methods:
        add(int x, int y): int - This method should print the sum of x and y.
                subtract(int x, int y): int - This method should print the difference between x and y.
                multiply(int x, int y): int - This method should print the product of x and y.
                divide(int x, int y): double - This method should print the quotient of x and y as a double.
                modulus(int x, int y): int - This method should print the remainder of x divided by y.

        Constraints:
        The divide method should handle the case where y is 0.
        If y is 0 you need to stop program without calculation
         */

        Calculator c1 = new Calculator();
        int x =4;
        int y = 8;
        c1.add(x, y);
        c1.subtract(x, y);
        c1.divide(x, y);
        c1.multiply(x, y);
        c1.modulus(x, y);
        c1.divide(5, 0);

    }
   public void add(int x, int y){
       System.out.println(x + y);
   }
    public void subtract(int x, int y){
        System.out.println(x - y);
    }
    public void multiply(int x, int y){
        System.out.println(x * y);
    }
    public void divide(int x, int y){
        if(y == 0){
            System.out.println("not divide by 0");
        }
        else{
            System.out.println(x / y);
        }
    }
    public void modulus(int x, int y){
        System.out.println(x % y);
    }
}
