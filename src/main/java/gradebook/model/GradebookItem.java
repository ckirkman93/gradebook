package gradebook.model;

/**
 * A GradebookItem represents a thing belonging to a Student that receives a
 * grade. Each object represented by this class belongs to a single Student.
 *
 * @author christina
 *
 */

public class GradebookItem {

    private String name;
    private double score;
    private double possibleScore;
    private double itemWeight;

    public GradebookItem(String name, GradebookCategory category, double score,
            double possibleScore) {
        this.setName(name);
        this.score = score;
        this.possibleScore = possibleScore;
        category.addItem(this);
    }

    public void setItemWeight(double weight) {
        this.itemWeight = weight;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public double getPossibleScore() {
        return possibleScore;
    }

    public double getPercentage() {
        return score / possibleScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
