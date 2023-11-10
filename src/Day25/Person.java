package Day25;

public class Person {
    /*Create a class called "Person" with an instance variable called
     "name"(string) and a static variable called "totalPersons"(int) .
     1. Implement a static method called displayTotalPersons" that prints the value of "totalPersons".
     2. Implement an instance method called "introduce" that prints a message introducing the person with their name.
    3. Create an empty constructor for Person class and increment static variable totalPersons there.
     So every time you create an object of Person static variable will be increased.
    4. Create a separate Java class called "TestPerson" with a main method.
    In the main method create multiple instances of the "Person" class.
    Call the "displayTotalPersons" method to check the total count.
    For example if you create two instances of Person class then displayTotalPersons method
            Should output:
    Total Persons: 2  */

   String name;
   static int  totalPerson  = 0;

    static void displayTotalPersons(){
        System.out.println(totalPerson);
   }
    void introduce(){
        System.out.println("hi my name is: " + name);
    }

    public Person(){
        totalPerson++;
    }
}
