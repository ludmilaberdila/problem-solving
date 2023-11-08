package Assignment2_Day35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        System.out.println();
        System.out.println("What shape do you want to created, " +
                "\nenter 'c' for circle, 'r' for rectangle or" +
                " enter 'q' any time if you want to exit");
        String userSelection;
        while(true) {
            userSelection = scanner.nextLine();

            if(userSelection.toLowerCase().equals("c")){
                System.out.print("Enter circle radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                shapes.add(circle);

            } else if (userSelection.toLowerCase().equals("r")) {
                System.out.print("Enter Rectangle length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter Rectangle width: ");
                double width = scanner.nextDouble();

                Rectangle rectangle = new Rectangle(length, width);
                shapes.add(rectangle);
            } else if (userSelection.toLowerCase().equals("q")) {
                break;
            }
            else {
                System.out.println("you did not enter the correct input (c, r, q)");
            }
            System.out.println("-------------------------");
            System.out.print("Chose another shape c -> circle, r -> rectangle: ");

            scanner.nextLine(); // consumes the dangling newline character
        }

        for (Shape shape : shapes){
            System.out.println(shape.shapeName() + " has area: " + shape.calculateArea());
        }






    }
}
