package Assignment_1_Day36;
/*1.1 Write a Java program to create a class Employee: private name(String), private salary(double)
    1.2 Create constructor which accepts all instance variables
    1.3 Create a method public void calculateSalary() -> print  0.
    1.4 Create a method public void myJob() -> print " "
    1.5 Create a method public double getSalary() -> return salary; use this method to access salary in subclasses */

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(){
        System.out.println(0);
    }
    public void myJob(){
        System.out.println("");
    }
    public double getSalary(){
        return salary;
    }
}
