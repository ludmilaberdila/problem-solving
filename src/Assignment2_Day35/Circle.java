package Assignment2_Day35;

public class Circle extends Shape{
    double radius;
//    String name;
    static int nrCircles = 0;
    public Circle(double radius){
        this.radius = radius;
        this.nrCircles++;
        name = "circle_" + this.nrCircles;
    }
    @Override
    public String shapeName() {
        return this.name;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
