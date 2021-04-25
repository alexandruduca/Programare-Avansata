package jdbc;

/**
 * The definition of the class Genre
 */
public class Genre {
    int id;
    String name;

    /**
     * The constructor of the class
     *
     * @param id   the id of the genre
     * @param name the name of the genre
     */
    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Getter for id
     *
     * @return the id of the genre
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id is the id of the genre
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for name
     *
     * @return the name of the genre
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     *
     * @param name is the name of the genre
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
