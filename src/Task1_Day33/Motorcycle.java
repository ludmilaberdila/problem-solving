package Task1_Day33;
/*•Create another subclass called "Motorcycle" that also inherits from "Vehicle"
   nd adds its own property for "numWheels" and a method called "rev" that prints out
        "Revving the engine". */

public class Motorcycle extends Vehicle {
    int numWheels;

    public Motorcycle(String make, String model, int year){
        super(make, model, year);
    }
    public void rev(){
        System.out.println("Revving the engine");
    }
}
