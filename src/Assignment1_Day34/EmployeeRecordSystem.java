package Assignment1_Day34;

import java.util.ArrayList;

public class EmployeeRecordSystem {
    ArrayList<Employee> employeesList = new ArrayList<>();

    public void addEmployee(Employee person){
        employeesList.add(person);
    }
    public void displayAllEmployee(){
        for (Employee person : employeesList){
            System.out.println("Employee Name: " + person.name +
                    " With ID: " + person.employeeID +
                    " Has salary:  " + person.salary);
        }
    }
    public void updateSalary(int empID, int salary){
        for (Employee person : employeesList){
            if(person.employeeID == empID){
                person.salary = salary;
                break;
            }
        }
    }
    public void removeEmployee(int empID) {
        for (Employee dracu: employeesList) {
            if(dracu.employeeID == empID){
                employeesList.remove(dracu);
                break;
            }
        }
    }

}

