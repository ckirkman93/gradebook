package test.scheme;

import gradebook.model.GradebookItem;
import gradebook.model.GradingScheme;

import java.util.List;

/**
 * This is the implementaion of a GradingScheme used in the JUnit tests.
 *
 * @author christina
 *
 */
public class DefaultGradingScheme implements GradingScheme {

    public double calculateScore(List<GradebookItem> items) {
        double score = 0;
        for (GradebookItem i : items) {
            score += i.getPercentage() * i.getItemWeight();
        }
        return score * 100;
    }

    public double calculateLetterGrade(List<GradebookItem> items) {
        double letterGrade;
        double score = calculateScore(items);

        if (score >= 90) {
            letterGrade = 4;
        } else if (score >= 80) {
            letterGrade = 3;
        } else if (score >= 70) {
            letterGrade = 2;
        } else if (score >= 60) {
            letterGrade = 1;
        } else {
            letterGrade = 0;
        }

        return letterGrade;
    }

}
