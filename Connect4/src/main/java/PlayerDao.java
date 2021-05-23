import exception.InvalidIdException;

import java.sql.*;

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

    public void findById(int id) {
        try {
            String query = "SELECT * FROM connect4 WHERE id = ?";
            PreparedStatement preparedStmt = database.con.prepareStatement(query);
            preparedStmt.setInt(1, id);
            ResultSet rs = preparedStmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                String player1 = rs.getString("player1");
                String player2 = rs.getString("player2");
                String winner = rs.getString("winner");
                found = true;
                System.out.println("The game no. " + id + " -> red: " + player1 + ", yellow: " + player2 + ", winner: " + winner);
            }
            if (!found)
                throw new InvalidIdException(id);

        } catch (SQLException | InvalidIdException exception) {
            exception.printStackTrace();
        }
    }

}

