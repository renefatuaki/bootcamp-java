package elfa;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Value
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
