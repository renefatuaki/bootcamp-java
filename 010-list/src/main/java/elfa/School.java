package elfa;

import java.util.ArrayList;
import java.util.List;

public class School {
    public List<Student> studentList = new ArrayList<>();
    public List<Course> courses = new ArrayList<>();


    public School() {
    }

    public School(List<Student> studentList) {
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

    public List<Course> getCourses() {
        return this.courses;
    }
}
