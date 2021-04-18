/**
 * The definition of the class Actor
 */
public class Actor {
    int id;
    int id_movie;
    String name;
    String stage_name;

    /**
     * The constructor of the class
     * @param id is the id of the actor
     * @param id_movie is the id of the movie
     * @param name is the name of the actor
     * @param stage_name is the stage name of the actor
     */
    public Actor(int id, int id_movie, String name, String stage_name) {
        this.id = id;
        this.id_movie = id_movie;
        this.name = name;
        this.stage_name = stage_name;
    }

    /**
     * Getter for id
     * @return the id of the actor
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     * @param id is the id of the actor
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for id movie
     * @return the id of the movie
     */
    public int getId_movie() {
        return id_movie;
    }

    /**
     * Setter for id movie
     * @param id_movie is the id of the movie
     */
    public void setId_movie(int id_movie) {
        this.id_movie = id_movie;
    }

    /**
     * Getter for name
     * @return the name of the actor
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name
     * @param name is the name of the actor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for stage name
     * @return the stage name of the actor
     */
    public String getStage_name() {
        return stage_name;
    }

    /**
     * Setter for stage name
     * @param stage_name is the stage name of the actor
     */
    public void setStage_name(String stage_name) {
        this.stage_name = stage_name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", id_movie=" + id_movie +
                ", name='" + name + '\'' +
                ", stage_name='" + stage_name + '\'' +
                '}';
    }
}
