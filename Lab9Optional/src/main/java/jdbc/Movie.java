package jdbc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

public class Movie {
    int id;
    String title;
    Date release_date;
    int duration;
    double score;

    public Movie(int id, String title, Date release_date, int duration, double score) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
        this.duration = duration;
        this.score = score;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelease_date() {
        return release_date;
    }


    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }


    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }


    public double getScore() {
        return score;
    }


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
