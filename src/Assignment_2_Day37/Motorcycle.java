package Assignment_2_Day37;
    /*Motorcycle: Implement the methods for starting, stopping, accelerating, and braking a motorcycle.*/
 public class Motorcycle implements Vehicle {
        public String name;
        public int speed = 0;
        public Motorcycle(String newName){
            this.name = newName;
        }
        @Override
       public void start(){
            System.out.println("Motorcycle started");
        }

        @Override
        public void stop() {
            this.speed = 0;
            System.out.println("Motorcycle stopped");
        }

        @Override
       public void accelerate(int speed) {
            if(speed > 0){
                this.speed = speed;
            }
            System.out.println("Motorcycle accelerate: " + speed + "km/h");
        }

        @Override
        public void brake() {
            System.out.println("Motorcycle applying brake ");
        }

        @Override
        public String getInfo(){
            String driving = "currently driving with " + this.speed + "km/h";
            if(speed == 0){
                driving = "currently stopped";
            }
            return this.name + " it is a motorcycle, " + driving;
        }
}
