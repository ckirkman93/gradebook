package gradebook.dao;

import gradebook.model.GradeableEntity;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import java.util.List;

/**
 * GradebookItemDAO provides an interface for a concrete DAO that would
 * communicate with a data source to store and retrieve GradebookItem objects.
 *
 * @author christina
 *
 */
public interface GradebookItemDAO {

    /**
     * This method can be used to return a list of all the GradebookItem
     * objects belonging to a particular GradebookEntity (such as a Student).
     *
     * @param entity The entity owning the gradebook items.
     * @return items A list of the gradebook items.
     */
    List<GradebookItem> getItemsForEntity(GradeableEntity entity);

    /**
     * This method returns a GradebookItem objects belonging to a particular
     * GradebookCategory.
     *
     * @param category The category of the items being retrieved.
     * @return items The GradebookItem objects corresponding to the category.
     */
    List<GradebookItem> getItemsForCategory(GradebookCategory category);

    /**
     * This method returns a specific GradebookItem object.
     *
     * @param id The id of a gradebook item.
     * @return item The GradebookItem object corresponding to the id.
     */
    GradebookItem getGradebookItem(int id);

    /**
     * This is used to store a GradebookCategory object in the database.
     *
     * @param item The item being stored.
     */
    void createGradebookItem(GradebookItem item);

    /**
     * This is used to remove a GradebookItem object from the database.
     *
     * @param item The item to be deleted.
     */
    void deleteGradebookItem(GradebookItem item);

}
