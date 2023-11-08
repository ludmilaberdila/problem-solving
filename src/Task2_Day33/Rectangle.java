package Task2_Day33;
  /*Create another subclass called "Rectangle" that inherits from "Shape" and adds its own
   properties for "length" and "width" and a method called "calculateArea" that calculates
   and prints the area of the rectangle. */

public class Rectangle extends Shape {
    double length = 6;
    double width = 8;

    public  Rectangle (String name, String color){

        super(name, color);
    }

    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }


}
