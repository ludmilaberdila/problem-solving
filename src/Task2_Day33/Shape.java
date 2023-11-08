package Task2_Day33;
          /*Create a parent class called "Shape" with properties for "name" and "color", and a
           method called "draw" that prints out "Drawing the shape". */

public class Shape {
    String name;
    String color;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void draw(){
        System.out.println("Drawing the shape");
    }
}
