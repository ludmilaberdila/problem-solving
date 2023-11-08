package Task3_Day33;
    /*Create a subclass called "Student" that inherits from "Person" and adds its own
     property for "studentId" and a method called "study" that prints out "Studying".
      Additionally, for the Student class, add a new method called "getStudentId" that
      returns the studentId property.*/
public class Student extends Person {
     int studentId;

     public Student (String name, int age, int sID){
         super(name, age);
         studentId = sID;
     }
     public void study(){
         System.out.println("Studying");
     }

        public int getStudentId(){
        return studentId;
        }
}
