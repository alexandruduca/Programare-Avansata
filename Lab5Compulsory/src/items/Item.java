package items;

import java.io.Serializable;
import java.nio.file.Path;

public abstract class Item {
    public String name;
    public Path path;

    public Item(String name, Path path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

}
