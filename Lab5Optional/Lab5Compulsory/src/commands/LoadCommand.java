package commands;

import catalog.Catalog;

import java.io.*;

public class LoadCommand {
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
