package Assignment_2_Day37;
    /*Car: Implement the methods for starting, stopping, accelerating, and braking a car.
    * Create another interface named Convertible with the following method:
     void openRoof(): This method should open the convertible vehicle's roof.
    Make the Car class implement the Convertible interface.
    Implement the openRoof method to open the roof of the car. */

class Car implements Vehicle, Convertible {
    boolean isConvertible;
    boolean roofIsOpen = false;
    public String name;
    public int speed = 0;
    public Car(String newName, boolean isConvert){
        this.name = newName;
        this.isConvertible = isConvert;
    }
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate(int speed) {
        if(speed > 0){
            this.speed = speed;
        }
        System.out.println("Car accelerate: " + speed + "km/h");
    }

    @Override
    public void brake() {
        System.out.println("Car applying brake ");
    }

    @Override
    public void openRoof() {
        if (isConvertible && !roofIsOpen) {
            System.out.println("This car is convertible. Demonstrating roof operations:");
            roofIsOpen = true;
        } else if(isConvertible && roofIsOpen){
            System.out.println("This car is convertible. roof is already opened:");
        }else {
            System.out.println("Car doesn't have a roof");
        }
    }
    @Override
    public void closeRoof(){
        if(isConvertible && roofIsOpen){
            System.out.println(this.name + " car is convertible. Demonstrating roof closing:");
            roofIsOpen = false;
        }else if(isConvertible && !roofIsOpen){
            System.out.println(this.name + " car is convertible. roof is already closed:");
        }
        else {
            System.out.println(this.name + " doesn't have a roof");
        }
    }
    @Override
    public String getInfo(){
        String convert = "";
        String driving = "currently driving with " + this.speed + "km/h";
        if(!this.isConvertible){
            convert = "not ";
        }
        if (this.speed == 0){
            driving = "currently stopped";
        }
        return this.name + " it is " + convert + "a convertible car, " + driving;
    }
}

