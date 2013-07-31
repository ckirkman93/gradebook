package gradebook.model;

import java.util.ArrayList;

/**
 * A GradebookCategory contains GradebookItems and applies a weight to them.
 * Each GradebookCategory object belongs to one and only one Student object.
 *
 * @author christina
 *
 */

public class GradebookCategory {

    private String name;
    private double categoryWeight;
    private ArrayList<GradebookItem> items;
    private double totalPossiblePoints;

    public GradebookCategory(String name, double weight) {
        this.setName(name);
        this.categoryWeight = weight;
        items = new ArrayList<GradebookItem>();
        totalPossiblePoints = 0;
    }

    public void addItem(GradebookItem item) {
        items.add(item);
        totalPossiblePoints += item.getPossibleScore();
        updateItemWeights();
    }

    /*
     * If there are two assignments of equal value in a GradebookCategory called
     * "Tests," and the category has a weight of 40%, then each of the two
     * assignments' weight will be 20%. This makes calculating an average easier
     * (for my brain, anyway) in a concrete GradingScheme class...
     */

    public void updateItemWeights() {
        double relativeItemWeight;
        for (GradebookItem item : items) {
            relativeItemWeight = item.getPossibleScore() / totalPossiblePoints;
            item.setItemWeight(relativeItemWeight * categoryWeight);
        }
    }

    public ArrayList<GradebookItem> getItems() {
        return items;
    }

    public double getPossiblePoints() {
        return totalPossiblePoints;
    }

    public double getWeight() {
        return categoryWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
