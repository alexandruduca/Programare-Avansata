import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The definition of the class DaoGenre
 */
public class DaoGenre {
    Database database;

    /**
     * The constructor of the class
     *
     * @param database
     */
    public DaoGenre(Database database) {
        this.database = database;
    }

    /**
     * This method adds a genre into the database
     *
     * @param genre is the genre that needs to be added
     * @throws SQLException
     */
    public void create(Genre genre) throws SQLException {
        String query = "INSERT INTO genres (id, name)" + " VALUES (?, ?)";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setInt(1, genre.getId());
        preparedStmt.setString(2, genre.getName());
        preparedStmt.executeUpdate();
        System.out.println("Genre " + genre.getName() + " successfully added into genres.");
    }

    /**
     * This method searches into the database for a specific id
     *
     * @param id is the id of the genre
     * @throws SQLException
     */
    public void findById(int id) throws SQLException {
        String query = "SELECT * FROM genres WHERE id = ?";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setInt(1, id);
        ResultSet rs = preparedStmt.executeQuery();
        boolean found = false;
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println("Genre with id " + id + " : " + name + ".");
            found = true;
        }
        if (!found)
            System.out.println("Genre with id " + id + " is not in the database.");
    }

    /**
     * This method searches into the database for a specific name
     *
     * @param name is the name of the genre
     * @throws SQLException
     */
    public void findByName(String name) throws SQLException {
        String query = "SELECT * FROM genres WHERE name = ?";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setString(1, name);
        ResultSet rs = preparedStmt.executeQuery();
        boolean found = false;
        while (rs.next()) {
            int id = rs.getInt("id");
            System.out.println("Id of genre with name " + name + " : " + id + ".");
            found = true;
        }
        if (!found)
            System.out.println("Genre with name " + name + " is not in the database.");
    }
}
