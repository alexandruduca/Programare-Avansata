package items;

import exceptions.InvalidYearException;

import java.io.Serializable;
import java.nio.file.Path;
import java.time.Year;

public class Song extends Item implements Serializable {
    public Year releaseYear;
    public String author;

    public Song(String name, String path, Year releaseYear, String author) {
        super(name, path);
        try {
            if (releaseYear.getValue() > 2021 || releaseYear.getValue() < 0)
                throw new InvalidYearException(releaseYear);
            this.releaseYear = releaseYear;
        } catch (InvalidYearException e) {
            e.printStackTrace();
        }
        this.author = author;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", path=" + path +
                ", releaseYear=" + releaseYear +
                ", author='" + author + '\'' +
                '}';
    }
}
