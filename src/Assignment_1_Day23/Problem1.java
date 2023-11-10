package Assignment_1_Day23;

public class Problem1 {
    public static void main(String[] args) {


       /* Create a "Rectangle" class with the following variables: width and length.
         Formula: Area = length * width ; Perimeter = 2 * (length + width)
        Add methods:
        void calculateArea() - it uses attributes to print area of rectangle
        void calculatePerimeter() - it uses attributes to print perimeter of rectangle
        1. Create the main method  and inside create 3 objects of Rectangle
        2. Then assign values to objects' attributes
        3. Then call 2 methods  for all  objects

        For example: if for rectangle1  you assign width 5 and length 6
        and for rectangle2 you assign width 2 and length 3.
        Expected output:
        Rectangle 1
        Area = 30
        Perimeter = 22

        Rectangle 2
        Area = 6
        Perimeter = 10 */

        Rectangle rec1 = new Rectangle();
        rec1.length = 6;
        rec1.width = 5;
        rec1.calculateArea();
        rec1.calculatePerimeter();

        Rectangle rec2 = new Rectangle();
        rec2.length = 6;
        rec2.width = 10;
        rec2.calculateArea();
        rec2.calculatePerimeter();

        Rectangle rec3 = new Rectangle();
        rec3.length = 6;
        rec3.width = 20;
        rec3.calculateArea();
        rec3.calculatePerimeter();



    }
}
