package Assignment_2_Day37;
    /*Motorcycle: Implement the methods for starting, stopping, accelerating, and braking a motorcycle.*/
 public class Motorcycle implements Vehicle {
        @Override
       public void start(){
            System.out.println("Motorcycle started");
        }

        @Override
        public void stop() {
            System.out.println("Motorcycle stopped");
        }

        @Override
       public void accelerate(int speed) {
            System.out.println("Motorcycle accelerate: " + speed + "km/h");
        }

        @Override
        public void brake() {
            System.out.println("Motorcycle applying brake ");
        }
}
