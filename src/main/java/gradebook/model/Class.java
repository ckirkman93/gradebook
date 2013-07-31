package gradebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class class represents an offering a Course for a particular semester.
 *
 * @author christina
 *
 */

public class Class implements GradeableEntity {

    private List<Section> sections;

    public Class() {
        sections = new ArrayList<Section>();
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public double averageScore(GradingScheme scheme) {
        double total = 0;
        for (Section s : sections) {
            total += s.averageScore(scheme);
        }
        return total / sections.size();
    }

    public double averageLetterGrade(GradingScheme scheme) {
        double total = 0;
        for (Section s : sections) {
            total += s.averageLetterGrade(scheme);
        }
        return Math.floor(total / sections.size());
    }

}
