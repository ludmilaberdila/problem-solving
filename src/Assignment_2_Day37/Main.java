package Assignment_2_Day37;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Vehicle Instances
        Car car = new Car("Lada", false);
        Car car1 = new Car("BMW", true);
        Motorcycle motorcycle = new Motorcycle("Haley");

        // Step 2: Operate and Display Vehicles
        VehicleManagement vehicleManager = new VehicleManagement();
        System.out.println("----------------------------------------");
        System.out.println("Operating and displaying the car:");
        vehicleManager.operateVehicle(car, 90);
        vehicleManager.displayVehicleInfo(car);
        System.out.println("----------------------------------------");
        System.out.println("Operating and displaying the car:");
        vehicleManager.operateVehicle(car1, 120);
        vehicleManager.displayVehicleInfo(car1);
        System.out.println("----------------------------------------");
        System.out.println("Operating and displaying the motorcycle:");
        vehicleManager.operateVehicle(motorcycle, 75);
        vehicleManager.displayVehicleInfo(motorcycle);
        System.out.println("----------------------------------------");
        // Step 3: Check if the Car is Convertible (Optional)
        if(car instanceof Convertible){
            Convertible convertibleCar = (Convertible) car;
            convertibleCar.openRoof();
            convertibleCar.closeRoof();
        }
        System.out.println("----------------------------------------");
        if(car1 instanceof Convertible){
            Convertible convertibleCar = (Convertible) car1;
            convertibleCar.openRoof();
            convertibleCar.closeRoof();
        }
        System.out.println("----------------------------------------");
    }
}
