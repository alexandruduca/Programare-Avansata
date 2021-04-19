import java.util.Date;

/**
 * The definition of the class Movie
 */
public class Movie {
    int id;
    String title;
    Date release_date;
    int duration;
    double score;

    /**
     * The constructor of the class
     *
     * @param id           is the id of the movie
     * @param title        is the title of the movie
     * @param release_date is the release date of the movie
     * @param duration     is the duration of the movie
     * @param score        is the score of the movie
     */
    public Movie(int id, String title, Date release_date, int duration, double score) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
        this.duration = duration;
        this.score = score;
    }

    /**
     * Getter for id
     *
     * @return the id of the movie
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for id
     *
     * @param id is the id of the movie
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for title
     *
     * @return the title of the movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for title
     *
     * @param title is the title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for release date
     *
     * @return the release date of the movie
     */
    public Date getRelease_date() {
        return release_date;
    }

    /**
     * Setter for release date
     *
     * @param release_date is the release date of the movie
     */
    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    /**
     * Getter for duration
     *
     * @return the duration of the movie
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Setter for duration
     *
     * @param duration is the duration of the movie
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Getter for score
     *
     * @return the score of the movie
     */
    public double getScore() {
        return score;
    }

    /**
     * Setter for score
     *
     * @param score is the score of the movie
     */
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", release_date=" + release_date +
                ", duration=" + duration +
                ", score=" + score +
                '}';
    }
}
