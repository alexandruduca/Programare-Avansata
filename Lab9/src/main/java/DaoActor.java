import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The definition of the class DaoActor
 */
public class DaoActor {
    Database database;

    /**
     * The constructor of the class
     *
     * @param database
     */
    public DaoActor(Database database) {
        this.database = database;
    }

    /**
     * This method adds an actor into the database
     *
     * @param actor is the actor that needs to be added
     * @throws SQLException
     */
    public void create(Actor actor) throws SQLException {
        String query = "INSERT INTO actors (id, id_movie, name, stage_name)" + "VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setInt(1, actor.getId());
        preparedStmt.setInt(2, actor.getId_movie());
        preparedStmt.setString(3, actor.getName());
        preparedStmt.setString(4, actor.getStage_name());
        preparedStmt.executeUpdate();
        System.out.println("Actor " + actor.getName() + " successfully added into actors.");
    }
}
