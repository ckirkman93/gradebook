package gradebook.dao;

import gradebook.model.GradingScheme;
import java.util.List;

/**
 * GradingSchemeDAO provides an interface for a concrete DAO that would
 * communicate with a data source to store and retrieve GradingScheme objects.
 *
 * @author christina
 *
 */
public interface GradingSchemeDAO {

    /**
     * This method can be used to return a list of all the GradingScheme
     * objects in the database.
     *
     * @return schemes A list of the GradingSchemes.
     */
    List<GradingScheme> getAllGradingSchemes();

    /**
     * This method returns a specific GradingScheme object.
     *
     * @param id The id of a GradingScheme.
     * @return scheme The GradingScheme object corresponding to the id.
     */
    GradingScheme getGradingScheme(int id);

    /**
     * This is used to store a GradingScheme object in the database.
     *
     * @param scheme The scheme being stored.
     */
    void createGradingScheme(GradingScheme scheme);

    /**
     * This is used to remove a GradingScheme object from the database.
     *
     * @param scheme The scheme to be deleted.
     */
    void deleteGradingScheme(GradingScheme scheme);

}
