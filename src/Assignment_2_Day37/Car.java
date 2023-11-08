package Assignment_2_Day37;
    /*Car: Implement the methods for starting, stopping, accelerating, and braking a car.
    * Create another interface named Convertible with the following method:
     void openRoof(): This method should open the convertible vehicle's roof.
    Make the Car class implement the Convertible interface.
    Implement the openRoof method to open the roof of the car. */

class Car implements Vehicle, Convertible {
    boolean roofOpen;
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerate: " + speed + "km/h");
    }

    @Override
    public void brake() {
        System.out.println("Car applying brake ");
    }

    @Override
    public void openRoof() {
        if (!roofOpen) {
            System.out.println("Car roof opened");
            roofOpen = true;
        } else {
            System.out.println("Car roof is already open");
        }
    }
}

