package gradebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Section class represents a single grouping of students. Multiple
 * Section objects make up a Class.
 *
 * @author christina
 *
 */
public class Section implements GradeableEntity {

    private List<Student> students;

    public Section() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double averageScore(GradingScheme scheme) {
        double total = 0;
        for (Student s : students) {
            total += s.averageScore(scheme);
        }
        return total / students.size();
    }

    public double averageLetterGrade(GradingScheme scheme) {
        double total = 0;
        for (Student s : students) {
            total += s.averageLetterGrade(scheme);
        }
        return Math.floor(total / students.size());

    }

}
