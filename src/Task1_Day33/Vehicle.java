package Task1_Day33;
  /*•Create a parent class called "Vehicle" that has properties for "make", "model",
and "year", and a method called "drive" that simply prints out "Driving the vehicle". */

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void drive(){
        System.out.println("Driving the vehicle");
    }

}
