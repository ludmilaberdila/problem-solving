package Task3_Day33;
    /* Create another subclass called "Teacher" that inherits from "Person" and adds its
    own property for "subject" and a method called "teach" that prints out "Teaching [subject]". */

public class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String sj){
        super(name, age);
        subject = sj;
    }
    public void teach (){
        System.out.println("Teaching: " + subject);
    }

    /*For the Teacher class, add a new method called "getSubject"
      that returns the subject property.*/
    public String getSubject(){
        return subject;
    }
}
