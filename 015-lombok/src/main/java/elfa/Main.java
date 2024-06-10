package elfa;

//  Coding: Lombok @Data
//  Step 1:     Add the Lombok dependency to your project and configure IntelliJ to support Lombok. ✅
//  Step 2:     Create a simple class "Student" with the following attributes: id, name, address, grade. ✅
//  Step 2.5:   Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity. ✅
//  Step 3:     Create a Teacher record with the following attributes: id, name, subject. ✅
//  Step 4:     Create a class Course with the following attributes: id, name, teacher, students. ✅
//  Step 4.5:   Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity. ✅
//  Step 5:     Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors. ✅
//  Step 6:     In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...). ✅

//  Coding: Lombok @Builder & @With
//  Step 1: Add the Builder pattern to all entities and create additional objects with the Builder in the main method. ✅
//  Step 2: Use the With annotation to facilitate changing properties. ✅
//  Please post the link to your GitHub repository where you solved this task together.
//  If you have already completed this task earlier, you may work on the bonus task on the next page.

//  Bonus

//  Find out what the Lombok annotation @Value does and use it for the Course class. ✅
//  Create a record University with the following attributes: id, name, courses. ✅
//  Create a class UniversityService and implement the following methods there:
//  Write a function to calculate the average grade of a Course (Pass the Course as a parameter). ✅
//  Write a function to calculate the average grade of the entire University (Pass a University object as a parameter).
//  Write a function that retrieves all students from a University with a minimum grade of 2/"Good" and returns them as a list (Pass a University object as a parameter). ✅

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1000", "Peter", "Berlin", 2.5);
        Student student2 = new Student("1001", "Paul", "Berlin", 2.0);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        Teacher teacher1 = Teacher.builder()
                .id("100")
                .name("Müller")
                .build();

        Teacher teacher2 = Teacher.builder()
                .id("101")
                .name("Meier")
                .build();


        Course mathematics = new Course("01", "Mathematics", teacher1, studentList);
        Course physics = new Course("02", "Physics", teacher2, studentList);

        System.out.println(physics);
        System.out.println(teacher1.name());
        teacher1 = teacher1.withName("Schmidt");
        System.out.println(teacher1.name());

        System.out.println(student2);
        student2.setName("Hans");
        System.out.println(student2);

        System.out.println(UniversityService.calcAvgGrade(physics));

        List<Course> courses = new ArrayList<>();
        courses.add(mathematics);
        courses.add(physics);

        University uni = new University("001", "HRW", courses);
        List<Student> goodStudents = UniversityService.getStudentsWithAvgGrade(uni, 2.2);
        System.out.println(goodStudents);
    }
}