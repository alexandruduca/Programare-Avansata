package jdbc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Chart {
    String name;
    Date creationDate;
    List<Movie> movieList;

    public Chart(String name, Date creationDate) {
        this.name = name;
        this.creationDate = creationDate;
        this.movieList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovieList(Movie movie) {
        movieList.add(movie);
    }

    @Override
    public String toString() {
        return "Chart{" +
                "name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", movieList=" + movieList +
                '}';
    }
}
