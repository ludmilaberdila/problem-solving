package Assignment_2_Day24;

public class TestEmployee {
    public static void main(String[] args) {
        /*Task 2:  Easy
        Create a Java class called "Employee" with the following instance variables:
        name (String)age (int)position (String)salary (double)

        Create the following constructors:
        1. A constructor that takes in the name, age, position, and salary as parameters
         and assigns them to the appropriate instance variables.

        2. A constructor that takes in the name and age as parameters and assigns
        them to the appropriate instance variables. It should set the
        position to "Unknown" and the salary to 0.0 by default.

        3. A constructor that takes in only the name as a parameter and assigns
         it to the appropriate instance variable. It should set the age to 0,
         the position to "Unknown," and the salary to 0.0 by default.

        4. Additionally, implement the following methods:
        displayEmployeeInfo(): This method prints out the name, age, position, salary of the employee.

        Create a separate Java class called "TestEmployee" with a main method.
        In the main method, create several instances of the Employee class using different constructors,
         and call the displayEmployeeInfo method on each instance to print out their information
         */

        Employee e1 = new Employee ("Milla", 20, "Manager", 4000.5 );
        Employee e2 = new Employee("Sofi", 19 );
        Employee e3 = new Employee("Alex");

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
        e3.displayEmployeeInfo();



    }
}
