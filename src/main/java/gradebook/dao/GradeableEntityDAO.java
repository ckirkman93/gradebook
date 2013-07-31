package gradebook.dao;

import gradebook.model.GradeableEntity;
import java.util.List;

/**
 * This is the interface to be used to implement concrete data access objects
 * for gradeable entities. Each concrete Gradeable Entity should have its own
 * DAO implementation.
 *
 * @author christina
 *
 */
public interface GradeableEntityDAO {

    /**
     * Returns all a list of all GradeableEntity objects of the type that the
     * concrete DAO handles. An implementation of this in CourseDAO should
     * return all the courses in the database.
     *
     * @return A list of all the entities
     */
    List<GradeableEntity> getAllEntities();

    /**
     * Returns a specific GradableEntity based on the Integer id provided.
     *
     * @param id The id of the particular GradableEntity being retrieved.
     * @return The entity with the matching id.
     */
    GradeableEntity getEntityByID(int id);

    /**
     * This should return a list of any matches to search for items in the data
     * store in the case the entity id is not known.
     *
     * @param name The name of an entity (for example, the name of a Student).
     * @return matches A list containing any matching entities.
     */
    List<GradeableEntity> searchForEntity(String name);

    /**
     * This method should store a GradeableEntity object in the database and
     * assign it a unique id.
     *
     * @param entity The entity that is being stored
     */
    void createEntity(GradeableEntity entity);

    /**
     * This method should remove a GradeableEntity object from the database.
     *
     * @param entity The entity to be removed.
     * @return success A boolean corresponding to the success of the method
     */
    boolean deleteEntity(GradeableEntity entity);

}
