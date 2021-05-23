import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlayerDao {
    Database database;

    public PlayerDao(Database database) {
        this.database = database;
    }

    public void create(String player1, String player2, String winner) {
        try {
            String sql = "SELECT MAX(id) FROM connect4";
            Statement stmt = database.con.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql);
            int id = 0;
            while (resultSet.next())
                id = resultSet.getInt(1);
            id++;
            String query = "INSERT INTO connect4 (id, player1, player2, winner)" + "VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = database.con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, player1);
            preparedStatement.setString(3, player2);
            preparedStatement.setString(4, winner);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }


    }
}
