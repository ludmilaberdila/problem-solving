package Assignment_1_Day37;
    /*Circle Class:

    Properties:
        radius (double): Radius of the circle.

    Methods:
    * Implement the abstract method to calculate the area of the circle and print the result.
    * Implement the abstract method to calculate perimeter of the circle and print the result.

    perimeter = 2 * 3.14 * radius;
    area = 3.14 * (radius * radius); */
   public class Circle extends Shape{

       double radius;

       public Circle(double newRadius, String name){
           super(name);
           this.radius = newRadius;
       }

        @Override
        void calculateArea() {
            double area = Math.PI * (radius * radius);
            System.out.println("Area of Circle is: " + area);
        }

        @Override
        void calculatePerimeter() {
            double perimeter = 2 * Math.PI * radius;
            System.out.println("Perimeter: " + perimeter);

        }
    }
