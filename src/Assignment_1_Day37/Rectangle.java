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

       public Rectangle(double length, double width, String name){
           super(name);
           this.length = length;
           this.width = width;
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
