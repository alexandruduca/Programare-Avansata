package jdbc;

import jpa.repo.AbstractRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The definition of the class DaoMovie
 */
public class DaoMovie extends AbstractRepository {
    Database database;

    /**
     * The constructor of the class
     *
     * @param database
     */
    public DaoMovie(Database database) {
        this.database = database;
    }

    /**
     * This method adds a movie into the database
     *
     * @param movie is the movie that needs to be added
     * @throws SQLException
     */
    public void create(Movie movie) throws SQLException {
        String query = "INSERT INTO movies (id, title, release_date, duration, score)" + " VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setInt(1, movie.getId());
        preparedStmt.setString(2, movie.getTitle());
        preparedStmt.setDate(3, (java.sql.Date) movie.getRelease_date());
        preparedStmt.setInt(4, movie.getDuration());
        preparedStmt.setDouble(5, movie.getScore());
        preparedStmt.executeUpdate();
        System.out.println("Movie " + movie.getTitle() + " successfully added into movies.");
    }

    /**
     * This method searches into the database for a specific id
     *
     * @param id is the id of the movie
     * @throws SQLException
     * @return
     */
    public Movie findById(int id) throws SQLException {
        String query = "SELECT * FROM movies WHERE id = ?";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setInt(1, id);
        ResultSet rs = preparedStmt.executeQuery();
        boolean found = false;
        while (rs.next()) {
            String title = rs.getString("title");
            Date release_date = rs.getDate("release_date");
            int duration = rs.getInt("duration");
            double score = rs.getDouble("score");
            Movie movie = new Movie(id, title, release_date, duration, score);
            System.out.println("Movie with id " + id + " : " + title
                    + " , release date: " + release_date
                    + " , duration: " + duration
                    + " , score: " + score
                    + ".");
            found = true;
            return movie;
        }
        if (!found)
            System.out.println("Movie with id " + id + " is not in the database.");
        return null;
    }

    /**
     * This method searches into the database for a specific title
     *
     * @param title is the title of the movie
     * @throws SQLException
     * @return
     */
    public Movie findByTitle(String title) throws SQLException {
        String query = "SELECT * FROM movies WHERE title = ?";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setString(1, title);
        ResultSet rs = preparedStmt.executeQuery();
        boolean found = false;
        while (rs.next()) {
            int id = rs.getInt("id");
            Date release_date = rs.getDate("release_date");
            int duration = rs.getInt("duration");
            double score = rs.getDouble("score");
            Movie movie = new Movie(id, title, release_date, duration, score);
            System.out.println("Id of movie with title " + title + " : " + id
                    + " , release date: " + release_date
                    + " , duration: " + duration
                    + " , score: " + score
                    + ".");
            found = true;
            return movie;
        }
        if (!found)
            System.out.println("Movie " + title + " is not in the database.");
        return null;
    }

    /**
     * This method creates a list of the actors from a specific movie
     *
     * @param title is the title of the movie
     * @return the list of actors who were involved into the movie
     * @throws SQLException
     */
    public List<String> getActors(String title) throws SQLException {
        List<String> actors = new ArrayList<>();
        String query = "SELECT name, stage_name FROM actors JOIN movies ON actors.id_movie=movies.id WHERE title = ?";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setString(1, title);
        ResultSet rs = preparedStmt.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            String stage_name = rs.getString("stage_name");
            actors.add(name + " (" + stage_name + ")");
        }
        return actors;
    }

    /**
     * This method creates a list of the directors from a specific movie
     *
     * @param title is the title of the movie
     * @return the list of directors who were involved into the movie
     * @throws SQLException
     */
    public List<String> getDirectors(String title) throws SQLException {
        List<String> directors = new ArrayList<>();
        String query = "SELECT name FROM directors JOIN movies ON directors.id_movie=movies.id WHERE title = ?";
        PreparedStatement preparedStmt = database.con.prepareStatement(query);
        preparedStmt.setString(1, title);
        ResultSet rs = preparedStmt.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            directors.add(name);
        }
        return directors;
    }
}
