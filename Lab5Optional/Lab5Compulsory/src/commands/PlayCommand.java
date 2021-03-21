package commands;

import catalog.Catalog;
import exceptions.NoItemFoundException;
import items.Item;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PlayCommand {
    public static void play(Catalog catalog, String name) {
        List<Item> itemList = catalog.getItemsList();
        Item item = null;
        try {
            for (Item i : itemList)
                if (i.getName().equals(name)) {
                    item = i;
                    break;
                }

            try {
                if (item == null)
                    throw new NoItemFoundException(name);
                File file = new File(String.valueOf(item.getPath()));
                if (!Desktop.isDesktopSupported()) {
                    System.out.println("not supported");
                    return;
                }
                Desktop desktop = Desktop.getDesktop();
                if (file.exists())
                    desktop.open(file);

            } catch (NoItemFoundException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
