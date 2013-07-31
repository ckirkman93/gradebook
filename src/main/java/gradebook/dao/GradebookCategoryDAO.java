package gradebook.dao;

import gradebook.model.GradeableEntity;
import gradebook.model.GradebookCategory;
import java.util.List;

/**
 * GradebookCategoryDAO provides an interface for a concrete DAO that would
 * communicate with a data source to store and retrieve GradebookCategory
 * objects.
 *
 * @author christina
 *
 */
public interface GradebookCategoryDAO {

    /**
     * This method can be used to return a list of all the GradebookCategory
     * objects belonging to a particular GradebookEntity (such as a Student).
     *
     * @param entity The entity owning the gradebook categories.
     * @return categories A list of the gradebook categories.
     */
    List<GradebookCategory> getCategoriesForEntity(GradeableEntity entity);

    /**
     * This method returns a specific GradebookCategory object.
     *
     * @param id The id of a gradebook category.
     * @return category The GradebookCategory object corresponding to the id.
     */
    GradebookCategory getGradebookCategory(int id);

    /**
     * This is used to store a GradebookCategory object in the database.
     *
     * @param category The category being stored.
     */
    void createGradebookCategory(GradebookCategory category);

    /**
     * This is used to remove a GradebookCategory object from the database.
     *
     * @param category The category to be deleted.
     */
    void deleteGradebookCategory(GradebookCategory category);

}
