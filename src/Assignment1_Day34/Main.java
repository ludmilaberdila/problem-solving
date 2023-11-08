package Assignment1_Day34;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Nick", 11, 5000, "IT");
        Engineer engineer = new Engineer("Anna",22,6000,"Java" );
        Technician technician = new Technician("John", 33,7000,10);

        EmployeeRecordSystem recordSystem = new EmployeeRecordSystem();
        recordSystem.addEmployee(engineer);
        recordSystem.addEmployee(manager);
        recordSystem.addEmployee(technician);

        recordSystem.displayAllEmployee();

        recordSystem.removeEmployee(22);
        recordSystem.removeEmployee(33);
        System.out.println("-------------------------------");

        recordSystem.displayAllEmployee();

        recordSystem.updateSalary(11,8000);

        recordSystem.displayAllEmployee();




    }
}
