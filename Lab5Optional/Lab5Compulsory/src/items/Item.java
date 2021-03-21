package items;

import java.io.Serializable;
import java.nio.file.Path;

public abstract class Item implements Serializable {
    public String name;
    public String path;

    public Item(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
