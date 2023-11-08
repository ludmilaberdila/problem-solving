package Assignment_2_Day37;
    /*Step 1: Interface Definition and Implementation
    Create an interface named Vehicle with the following methods:
    void start(): This method should start the vehicle.
    void stop(): This method should stop the vehicle.
    void accelerate(int speed): This method should accelerate the vehicle to the specified speed.
    void brake(): This method should apply the brakes to the vehicle.
    Implement the Vehicle interface in the following classes:  */
   interface  Vehicle {
      void start();
      void stop();
      void accelerate(int speed);
      void brake();
      String getInfo();
}
