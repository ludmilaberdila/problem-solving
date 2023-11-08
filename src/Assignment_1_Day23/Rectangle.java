package Assignment_1_Day23;

public class Rectangle {
     int width;
     int length;

     public void calculateArea(){
        int area = length * width;
         System.out.println(area);
     }
    public void calculatePerimeter(){
         int perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }

}
