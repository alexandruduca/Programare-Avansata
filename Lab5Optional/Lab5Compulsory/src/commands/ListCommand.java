package commands;

import catalog.Catalog;
import items.Item;

public class ListCommand {

    public static void list(Catalog catalog) {
        for (Item item : catalog.getItemsList())
            System.out.println(item);
    }
}
