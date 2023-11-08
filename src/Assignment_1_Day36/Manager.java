package Assignment_1_Day36;
/*2.1 Create a subclass Manager
2.2 Create constructor which accepts all instance variables
2.3 Override calculateSalary()  -> it must print salary * 2
2.4 Override myJob() -> it must print
 "I plan, organize, direct, and control resources to achieve specific goals."
 */
public class Manager extends Employee {

    public Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary calculated: $" + (getSalary() * 2));    }

    @Override
    public void myJob() {
        System.out.println( "I plan, organize, direct, and control resources to achieve specific goals.");
    }
}
