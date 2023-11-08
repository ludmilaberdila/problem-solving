package Assignment_1_Day36;
   /*4.1 Create a Main class with a main method
   4.2 Create an object of Manager class up-casted to Employee and call calculateSalary() and myJob() methods
   4.3 Create an object of Programmer class and call calculateSalary() and myJob() methods */
public class Main {
    public static void main(String[] args) {
        Employee manager = (Employee) new Manager("Ella",5000);
        manager.calculateSalary();
        manager.myJob();

        Programmer programmer = new Programmer("Ana", 3000);
        programmer.calculateSalary();
        programmer.myJob();
    }
}
