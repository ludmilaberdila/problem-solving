package Task3_Day33;
    /*Create a parent class called "Person" with properties for "name" and "age", and a
     method called "introduce" that prints out "My name is [name] and I am [age] years old". */

public class Person {
    String name ;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("My name is: " + name + " I am: " + age + " years old");
    }

}
