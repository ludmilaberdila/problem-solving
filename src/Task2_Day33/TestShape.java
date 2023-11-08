package Task2_Day33;
   /*Create TestShape class, in the main method of this class create instances of both
    the “Circle” and “Rectangle” classes, and call all their methods. */

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("Cirle", "Blue", 4);
        Rectangle rectangle = new Rectangle("Rectangle", "White", 6, 8);

        System.out.println(circle.name + " " + circle.color + " " + circle.radius);
        circle.calculateArea();

        System.out.println(rectangle.name + " " + rectangle.color + " " + rectangle.length
        + " " + rectangle.width);
        rectangle.calculateArea();
    }
}
