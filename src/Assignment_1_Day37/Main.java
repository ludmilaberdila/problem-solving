package Assignment_1_Day37;
    /*In the main class, create instances of the Circle and Rectangle classes, with values.
    Call methods calculateArea(), calculatePerimeter() and displayInfo() for circle object.
    Call methods calculateArea(), calculatePerimeter() and displayInfo() for rectangle object. */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8.0,"Circle1");
        Rectangle rectangle = new Rectangle(4.4,8.5,"Rectangle1");

        circle.calculateArea();
        circle.calculatePerimeter();
        circle.displayInfo();
        System.out.println("------------------------------------");

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.displayInfo();
    }
}
