package catalog;

import items.Item;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    List<Item> itemList = new ArrayList<>();
    String path;

    public Catalog(String path) {
        this.itemList = new ArrayList<>();
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public List<Item> getItemsList() {
        return itemList;
    }

    public void addItemsList(Item item) {
        itemList.add(item);
    }

    public void play(Item item) {
        try {
            File file = new File(String.valueOf(itemList.get(itemList.indexOf(item)).getPath()));
            if (!Desktop.isDesktopSupported()) {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())
                desktop.open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void list() {
        for (Item item : itemList)
            System.out.println(item);
    }

    public static void save(Catalog catalog)
            throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }

}




