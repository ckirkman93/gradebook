package gradebook.model;

import java.util.List;

/**
 * A GradingScheme is used by Student objects for computing average scores or
 * letter grades based on a List of the Student's GradebookItems.
 *
 * @author christina
 *
 */

public interface GradingScheme {

    double calculateScore(List<GradebookItem> gradebookItems);

    double calculateLetterGrade(List<GradebookItem> gradebookItems);

}
