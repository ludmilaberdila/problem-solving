package Assignment1_Day34;

public class Manager extends Employee{
    String  department;

    public Manager(String name, int employeeID, int salary, String dep){
        super(name, employeeID, salary);
        department = dep;
    }
}
