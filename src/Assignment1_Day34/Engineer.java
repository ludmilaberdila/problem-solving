package Assignment1_Day34;

public class Engineer extends Employee{
    String programmingLanguage;

    public Engineer(String name, int employeeID, int salary, String proLang){
        super(name, employeeID, salary);
        programmingLanguage = proLang;
    }

}
