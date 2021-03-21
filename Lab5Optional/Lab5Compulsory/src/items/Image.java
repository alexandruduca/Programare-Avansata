package items;

import java.io.Serializable;
import java.nio.file.Path;

public class Image extends Item implements Serializable {
    public String author;

    public Image(String name, String path, String author) {
        super(name, path);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                ", path=" + path + '\'' +
                "author='" + author +
                '}';
    }
}
