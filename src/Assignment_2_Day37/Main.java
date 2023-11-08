package Assignment_2_Day37;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Vehicle Instances
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Step 2: Operate and Display Vehicles
        VehicleManagement vehicleManager = new VehicleManagement();

        System.out.println("Operating and displaying the car:");
        vehicleManager.operateVehicle(car);
        vehicleManager.displayVehicleInfo(car);

        System.out.println("\nOperating and displaying the motorcycle:");
        vehicleManager.operateVehicle(motorcycle);
        vehicleManager.displayVehicleInfo(motorcycle);

        // Step 3: Check if the Car is Convertible (Optional)
        if (car instanceof Convertible) {
            Convertible convertibleCar = (Convertible) car;
            System.out.println("\nThis car is convertible. Demonstrating roof operations:");
            convertibleCar.openRoof();
        } else {
            System.out.println("\nThis car is not convertible.");
        }
    }
}
