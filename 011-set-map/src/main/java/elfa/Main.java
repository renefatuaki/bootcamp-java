package elfa;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
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