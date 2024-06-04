package elfa;

import java.util.HashSet;
import java.util.Set;

public class School {
    public Set<Student> studentList = new HashSet<>();
    public Set<Course> courses = new HashSet<>();


    public School() {
    }

    //  Step 1: Convert your application from the List lecture so that the School Object uses a Hashmap instead of an ArrayList.

    public School(Set<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void printStudents() {
        System.out.println(this.studentList);
    }

    public Student getStudent(int id) {
        for (Student student : studentList) {
            if (student.id == id) {
                return student;
            }
        }

        return null;
    }

    public void deleteStudent(Student student) {
        studentList.remove(student);
    }

    public Set<Course> getCourses() {
        return this.courses;
    }
}
