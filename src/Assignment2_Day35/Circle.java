package Assignment2_Day35;

public class Circle extends Shape{
    double radius;
    public Circle(double radius){

        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14159 * radius * radius;
    }
}
