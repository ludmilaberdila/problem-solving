package Task1_Day33;
  /*•Create a subclass called "Car" that inherits from "Vehicle" and adds its own property
   for "numDoors" and a method called "start" that prints out "Starting the car".*/

public class Car extends Vehicle{
    int numDoors;
  public Car(String make, String model, int year){
      super(make, model, year);
  }

 public void start(){
        System.out.println("Starting the car");
    }

}
