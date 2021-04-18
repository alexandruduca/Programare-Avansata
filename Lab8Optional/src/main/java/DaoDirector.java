import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The definition of the class DaoDirector
 */
public class DaoDirector {
    Database database;

    /**
     * The constructor of the class
     *
     * @param database
     */
    public DaoDirector(Database database) {
        this.database = database;
    }

    /**
     * This method adds a director into the database
     *
     * @param director is the director that needs to be added
     * @throws SQLException
     */
    public void create(Director director) throws SQLException {
        String query = "INSERT INTO directors (id, id_movie, name)" + " VALUES (?, ?, ?)";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setInt(1, director.getId());
        preparedStmt.setInt(2, director.getId_movie());
        preparedStmt.setString(3, director.getName());
        preparedStmt.executeUpdate();
        System.out.println("Director " + director.getName() + " successfully added into directors.");
    }
}
