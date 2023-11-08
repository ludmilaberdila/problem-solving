package Task2_Day33;
  /*Create a subclass called "Circle" that inherits from "Shape" and adds its own property
   for "radius" and a method called "calculateArea" that calculates and prints the area of the
    circle. */

public class Circle extends Shape {
    double radius = 4;

    public Circle (String name, String color){

        super(name, color);
    }

    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }

}
