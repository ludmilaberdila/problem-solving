package Assignment_1_Day37;
    /* Rectangle Class:
    Properties:
        length (double): Length of the rectangle.
        width (double): Width of the rectangle.
    Methods:
    * Implement the abstract method to calculate the area of the rectangle and print the result.
    * Implement the abstract method to calculate perimeter of the rectangle and print the result.

    Constructor with all instance variables

    perimeter = 2 * (length + width)
    area = length * width  */

   public class Rectangle extends Shape {
       double length;
       double width;

       public Rectangle(double newLength, double newWidth, String name){
           super(name);
           this.length = newLength;
           this.width = newWidth;
       }

       @Override
       void calculateArea() {
           double area = length * width;
           System.out.println("Area of the rectangle: " + area);
       }

       @Override
       void calculatePerimeter() {
           double perimeter = 2 * (length + width);
           System.out.println("Perimeter of the rectangle: " + perimeter);
       }
   }
