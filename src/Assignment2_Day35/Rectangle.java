package Assignment2_Day35;

public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
}
