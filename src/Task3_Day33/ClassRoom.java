package Task3_Day33;
        /*Create new Classroom class, create instances of both the “Student” and “Teacher”
          classes, and call their methods there. */

public class ClassRoom {
    public static void main(String[] args) {
        Student student = new Student("Mia", 18, 223);
        Teacher teacher = new Teacher("Ella", 39, "Art");

        System.out.println("Student ID: " + student.getStudentId());
        student.introduce();


        System.out.println("====================");
        System.out.println("Teacher Subject: " + teacher.getSubject());
        teacher.introduce();
    }
}
