package Task1_Day33;
 /*Create a Garage class, in the main method of this class create instances of both
 the “Car” and “Motorcycle” classes, and call their methods to demonstrate how inheritance
 works. */

public class Garage {
    public static void main(String[] args) {
        Car car = new Car("Lexus", "es300", 1999);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Maristo", 2015);
        car.numDoors = 4;
        motorcycle.numWheels = 2;


        System.out.println("I have in my Garage a new " + car.make + " " + car.model + " " + car.year
                + " with " + car.numDoors + " door");

        System.out.println("I have in my Garage a new " + motorcycle.make + " " + motorcycle.model
                + " " + motorcycle.year
                + " with " + motorcycle.numWheels + " wheels");


    }
}
