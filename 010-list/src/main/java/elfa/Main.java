package elfa;

//Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
//Step 2: Create a Java List for elements of type "Student" and add multiple students.
//Step 3: Create a class "School" to which students can be added through a method ('addStudent').
//Step 4: Implement a method to print all students of the school (as text, to the console).
//Step 5: Add a method to find a student by their ID. The found student should be returned.
//Step 6: Create a method to remove a student from the school.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", "Meier", 1));
        students.add(new Student("Heiner", "Schreiner", 2));
        Student badStudent = new Student("Manfred", "Müller", 3);

        School school = new School(students);
        school.addStudent(badStudent);
        school.printStudents();

        school.deleteStudent(badStudent);

        System.out.println(school.getStudent(1));

        Course mathCourse = new Course("Math", "XY", "001");
        Course physicsCourse = new Course("Physics", "XZ", "002");
        Course biologicCourse = new Course("Biologic", "YZ", "001");

        Student firstStudent = school.getStudent(1);

        firstStudent.setCourse(mathCourse);
        firstStudent.setCourse(physicsCourse);
        firstStudent.setCourse(biologicCourse);

        System.out.println(school.getCourses());
    }
}