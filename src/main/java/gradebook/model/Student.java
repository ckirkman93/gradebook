package gradebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Student class represents an indivdual who is/was/presumably will be
 * enrolled in a Course and assigned to a particular Section of that Course.
 * They can be given GradebookItem objects.
 *
 * @author christina
 *
 */
public class Student implements GradeableEntity {

    private String name;
    private List<GradebookItem> scoredItems;

    public Student(String name) {
        this.setName(name);
        scoredItems = new ArrayList<GradebookItem>();
    }

    public void giveGrade(GradebookItem item) {
        scoredItems.add(item);
    }

    public double averageScore(GradingScheme scheme) {
        return scheme.calculateScore(scoredItems);
    }

    public double averageLetterGrade(GradingScheme scheme) {
        return scheme.calculateLetterGrade(scoredItems);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
