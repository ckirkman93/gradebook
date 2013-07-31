package gradebook.model;

/**
 * GradeableEntity refers to any object that can be given an average score or
 * letter grade (in this case, that's Course, Class, Section, and Student
 * objects) using a specified GradingScheme.
 *
 * @author christina
 *
 */

public interface GradeableEntity {

    double averageScore(GradingScheme scheme);

    double averageLetterGrade(GradingScheme scheme);

}
