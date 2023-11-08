package Assignment2_Day34;

import Assignment1_Day34.Employee;

import java.util.ArrayList;

public class StudentEnrollmentSystem {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        for (Student student: students){
//            Object enrolled = null;
            System.out.println("Enrolled students: " +
                    student.name + " " + "StudentID" + " " +
                    student.studenID) ;
        }
    }
    public void updateStudentName(int studentID, String name) {
        for (Student person : students) {
            if (person.studenID == studentID) {
                person.name = name;
                break;
            }
        }
    }
    public void removeStudent(int studentID){
        for (Student st : students) {
            if (st.studenID == studentID) {
                students.remove(st);
                break;
            }
        }
    }


}
