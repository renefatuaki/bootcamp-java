package elfa;

import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {
    static double calcAvgGrade(Course course) {
        return course.getStudents().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0);
    }

    static List<Student> getStudentsWithAvgGrade(University uni, double minGrade) {
        return uni.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() <= minGrade)
                .collect(Collectors.toList());
    }
}
