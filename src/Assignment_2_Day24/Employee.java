package Assignment_2_Day24;

    public class Employee {
        String name;
        int age;
        String position;
        double salary;

        public Employee(String newName, int newAge, String newPosition, double newSalary) {
            name = newName;
            age = newAge;
            position = newPosition;
            salary = newSalary;
        }

        public Employee(String newName, int newAge) {
            name = newName;
            age = newAge;
            position = "Unknown";
            salary = 0.0;
        }

        public Employee(String newName) {
            name = newName;
            age = 0;
            position = "Unknown";
            salary = 0.0;
        }

        public void displayEmployeeInfo() {
            System.out.println(name + " , " + age + " , " + position + " , " + salary);
        }
    }



