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

    public void setPath(String path) {
        this.path = path;
    }

    public List<Item> getItemsList() {
        return itemList;
    }

    public void add(Item item) {
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

    public static Catalog load(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fis);
            Catalog catalog = (Catalog)in.readObject();
            fis.close();
            return catalog;
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

}




