package Assignment2_Day34;

public class Main {
    public static void main(String[] args) {
        StudentEnrollmentSystem studentEnrollmentSystem = new StudentEnrollmentSystem();

        Student student = new Student("Maia", 00);

       UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Ion",11);

        UndergraduateStudent undergraduateStudent2 = new UndergraduateStudent("Mia",22);

        GraduateStudent graduateStudent = new GraduateStudent("Ema", 33);

        studentEnrollmentSystem.addStudent(undergraduateStudent);
        studentEnrollmentSystem.addStudent(undergraduateStudent2);
        studentEnrollmentSystem.addStudent(graduateStudent);

        studentEnrollmentSystem.displayStudents();
        System.out.println("---------------------------");

        studentEnrollmentSystem.removeStudent(11);
        studentEnrollmentSystem.removeStudent(33);
        studentEnrollmentSystem.displayStudents();

        studentEnrollmentSystem.updateStudentName(22,"Abby");

        studentEnrollmentSystem.displayStudents();




    }
}
