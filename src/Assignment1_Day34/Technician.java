package Assignment1_Day34;

public class Technician extends Employee {
    int yearsOfExperience;

    public Technician(String name, int employeeID, int salary, int yearsOf){
        super(name, employeeID, salary);
        yearsOfExperience = yearsOf;
    }

}
