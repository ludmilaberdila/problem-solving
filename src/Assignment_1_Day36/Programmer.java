package Assignment_1_Day36;
/*3.1 Create a subclass Programmer
3.2 Create constructor which accepts all instance variables
3.3 Override calculateSalary()  -> it must print salary * 3
3.4 Override myJob() -> it must print
"I write, modify, and test code and scripts that allow computer software and applications to function properly."
 */
  public class Programmer extends Employee{

    public Programmer(String name, double salary){
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary calculated: $" + (getSalary() * 3));    }

    @Override
    public void myJob() {
        System.out.println( "I write, modify, and test code and scripts that allow computer software " +
                "and applications to function properly.");
    }
}
