package Assignment_2_Day37;
    /*Create a VehicleManagement class with the following methods:
     void operateVehicle(Vehicle vehicle): This method should operate
     the given vehicle (start, accelerate, stop, and brake).
     void displayVehicleInfo(Vehicle vehicle):
     This method should display information about the given vehicle.  */
        class VehicleManagement {
            void operateVehicle(Vehicle vehicle) {
                vehicle.start();
                vehicle.accelerate(60);
                vehicle.stop();
                vehicle.brake();
            }

            void displayVehicleInfo(Vehicle vehicle) {
                System.out.println("Vehicle Information:");
                operateVehicle(vehicle);
            }
        }
