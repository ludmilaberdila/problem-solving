package Assignment2_Day35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<>();
        System.out.println("What shape do you want to created, " +
                "chose 'c' for circle, 'r' for rectangle or" +
                " enter 'q' any time if you want to exit");
        while (true) {
            String userSelection = scanner.nextLine();
            if(userSelection.toLowerCase().equals("c")){
                System.out.println("Enter cirle radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                shapes.add(circle);

            } else if (userSelection.toLowerCase().equals("r")) {
                System.out.println("Enter Rectangle length");
                double length = scanner.nextDouble();

                System.out.println("Enter Rectangle width");
                double width = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(length, width);
                shapes.add(rectangle);
            } else if (userSelection.toLowerCase().equals("q")) {
                break;
            }
            else {
                System.out.println("you did not enter the correct value");
            }
            System.out.println("-------------------------");
            System.out.print("Chose another shape c - circle, r - rectangle: ");
        }

        for (Shape shape : shapes){
            System.out.println(shape.calculateArea());
        }






    }
}
