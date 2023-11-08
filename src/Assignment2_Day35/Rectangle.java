package Assignment2_Day35;

public class Rectangle extends Shape{
    double length;
    double width;
    String name;
    static int nrRectangles = 0;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.nrRectangles++;
        this.name = "rectangle_" + this.nrRectangles;
    }

    @Override
    public String shapeName() {
        return this.name;
    }

    public double calculateArea(){
        return length * width;
    }
}
