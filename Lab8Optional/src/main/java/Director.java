/**
 * The definition of the class Director
 */
public class Director {
    int id;
    int id_movie;
    String name;

    /**
     * The constructor of the class
     * @param id is the id of the director
     * @param id_movie is the id of the movie
     * @param name is the name of the director
     */
    public Director(int id, int id_movie, String name) {
        this.id = id;
        this.id_movie = id_movie;
        this.name = name;
    }

    /**
     * Getter for id
     * @return the id of the director
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     * @param id is the id of the director
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for movie id
     * @return the movie id
     */
    public int getId_movie() {
        return id_movie;
    }

    /**
     * Setter for movie id
     * @param id_movie is the id of the movie
     */
    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    /**
     * Getter for name
     * @return the name of the director
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name is the name of the director
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", id_movie=" + id_movie +
                ", name='" + name + '\'' +
                '}';
    }
}
